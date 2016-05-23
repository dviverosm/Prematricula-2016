package co.edu.unicauca.prematricula.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;

import co.edu.unicauca.prematricula.entities.*;
import co.edu.unicauca.prematricula.sessionbeans.*;


@ManagedBean(name="prematriculaController")
@SessionScoped
public class PrematriculaController {
	
	/*Atributo que contiene los datos del usuario de la sesion*/
	@ManagedProperty("#{inicioSesionService}")
	private InicioSesionService service_session;
	public void setService_session(InicioSesionService service_session) {
		this.service_session = service_session;
	}

	UsuarioEntity usuario;
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

	/* Atributo para el direccionamiento de la aplicacion*/
	private String ruta;
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	/*Atributos para el proceso de prematricula*/
	@ManagedProperty("#{prematriculaService}")
	private PrematriculaService service_prematricula;
	public void setService_prematricula(PrematriculaService service_prematricula) {
		this.service_prematricula = service_prematricula;
	}

	private boolean skip;
	public boolean isSkip() {
		return skip;
	}
	
	private List<MateriaEntity> materias_prematricula;
	public List<MateriaEntity> getMaterias_prematricula() {
		return materias_prematricula;
	}

	private List<MateriaEntity> filteredMaterias;
	public List<MateriaEntity> getFilteredMaterias() {
		return filteredMaterias;
	}
	public void setFilteredMaterias(List<MateriaEntity> filteredMaterias) {
		this.filteredMaterias = filteredMaterias;
	}
	
	private List<MateriaEntity> materiasSeleccionadas;
	public List<MateriaEntity> getMateriasSeleccionadas() {
		return materiasSeleccionadas;
	}
	public void setMateriasSeleccionadas(List<MateriaEntity> materiasSeleccionadas) {
		this.materiasSeleccionadas = materiasSeleccionadas;
	}
	
	private boolean estadoPrematricula;
	public boolean isEstadoPrematricula() {
		return estadoPrematricula;
	}
	public void setEstadoPrematricula(boolean estadoPrematricula) {
		this.estadoPrematricula = estadoPrematricula;
	}

	/*Atributos para Historia Academica*/
	@ManagedProperty("#{historiaService}")
    private HistoriaService service_historia;
	public void setService_historia(HistoriaService service_historia) {
		this.service_historia = service_historia;
	}

	private List<MateriaEntity> materias_historia;
	public List<MateriaEntity> getMaterias_historia() {
		return materias_historia;
	}
	
	/*Atributos para Reporte del Coordinador*/
	@ManagedProperty("#{reporteService}")
	private ReporteService service_reporte;
	public void setService_reporte(ReporteService service_reporte) {
		this.service_reporte = service_reporte;
	}
	
	private List<PrematriculaEntity> materiasReporte;
	public List<PrematriculaEntity> getMateriasReporte() {
		return materiasReporte;
	}
	public void setMateriasReporte(List<PrematriculaEntity> materiasReporte) {
		this.materiasReporte = materiasReporte;
	}
	
	
	@PostConstruct
	public void init(){
		this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
		//this.ruta = "/Estudiante/ProcesoPrematricula.xhtml";
		materiasSeleccionadas = new ArrayList<MateriaEntity>();
		usuario = new UsuarioEntity();
		estadoPrematricula = true;
		materiasReporte = service_reporte.getReporte();
	}
	
	/*Metodos de Redireccion*/
	public void goToPrematricula(){
		this.ruta = "/Estudiante/ProcesoPrematricula.xhtml";
	}
	public void goToHistoriaAcademica(){
		this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
	}
	
	/*Metodos de Proceso de Prematricula*/
	public String onFlowProcess(FlowEvent event){
		if(skip){
			skip = false;
			return "confirm";
		}else{
			return event.getNewStep();
		}
	}
	public void save1(){
		estadoPrematricula = service_prematricula.setPrematricula(usuario.getId(), materiasSeleccionadas); 
		if(estadoPrematricula){
			materias_prematricula.clear();
			materias_prematricula = service_prematricula.getMaterias(usuario.getId());
			this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
		}
		
	}
	public void save2(){
		if(estadoPrematricula){
			FacesMessage msg = new FacesMessage("Exito", "Prematricula realizada con éxito");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
		}else{
			FacesMessage msg = new FacesMessage("Error", "La prematricula no se pudo registrar");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		
	}

	/*Metodos de Inicio de Sesion*/
	public String iniciarSesion(){
		
		String ruta = "index";		
		UsuarioEntity usu = service_session.getUsuario(usuario.getUsername(), usuario.getPassword());
		if(service_session.comprobarCredenciales(usu)){
			usuario = usu;
			if(usuario.getPrivilegio().equals("Estudiante")){
				
				this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
			}else{
				this.ruta = "/Coordinador/ReportePrematricula.xhtml";
			}
			ruta = "main?faces-redirect=true";
		}
		materias_historia = service_historia.getMaterias(usuario.getId());
		materias_prematricula = service_prematricula.getMaterias(usuario.getId());
		return ruta;
	}
	public void validacion(){
		if(usuario.getUsername() == "" && usuario.getPassword() == "")
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Advertencia!", "Usuario y Contraseña requerida."));
		if(usuario.getUsername() == "" && usuario.getPassword() != "")
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Advertencia!", "Usuario requerido."));
		if(usuario.getUsername() != "" && usuario.getPassword() == "")
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Advertencia!", "Contraseña requerida."));
	}
	public String cerrarSesion(){
		this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
		return "index?faces-redirect=true";
	}


}
