package co.edu.unicauca.prematricula.managedbeans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;

import util.C;

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
	
	private String programa;
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	private List<String> programas;
	public List<String> getProgramas() {
		return programas;
	}
	public void setProgramas(List<String> programas) {
		this.programas = programas;
	}
	private boolean docente;

	/* Atributo para el direccionamiento de la aplicacion*/
	private String ruta;
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	/*Atributos para el proceso de prematricula*/
	
	private boolean prematriculaRealizada;
	
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
	
	private List<PrematriculaBD> materiasReporte;
	public List<PrematriculaBD> getMateriasReporte() {
		return materiasReporte;
	}
	public void setMateriasReporte(List<PrematriculaBD> materiasReporte) {
		this.materiasReporte = materiasReporte;
	}
	
	private String periodoAcademico;
	public String getPeriodoAcademico() {
		return periodoAcademico;
	}
	public void setPeriodoAcademico(String periodoAcademico) {
		this.periodoAcademico = periodoAcademico;
	}
	
	private List<String> periodosAcademicos;
	public List<String> getPeriodosAcademicos() {
		return periodosAcademicos;
	}
	
	@PostConstruct
	public void init(){
		this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
		//this.ruta = "/Estudiante/ProcesoPrematricula.xhtml";
		materiasSeleccionadas = new ArrayList<MateriaEntity>();
		usuario = new UsuarioEntity();
		estadoPrematricula = true;
		cargarProgramas();
		this.programa = "";
	}
	
	/*Metodos de Redireccion*/
	public void goToPrematricula(){
		if(this.prematriculaRealizada){
			this.ruta = "/Estudiante/PrematriculaRealizada.xhtml";
		}else{
			this.ruta = "/Estudiante/ProcesoPrematricula.xhtml";			
		}
		
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
		estadoPrematricula = service_prematricula.setPrematricula(usuario, materiasSeleccionadas); 
		materias_prematricula.clear();
		if(estadoPrematricula){
			materias_prematricula = service_prematricula.getMaterias(usuario.getCodigo(), this.materias_historia, this.programa);
			this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
		}
		
		
	}
	public void save2(){
		FacesMessage msg = new FacesMessage("Exito", "Prematricula realizada con éxito");
		if(estadoPrematricula){
			this.prematriculaRealizada=true;
			//FacesMessage msg = new FacesMessage("Exito", "Prematricula realizada con éxito");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
		}else{
			//FacesMessage msg = new FacesMessage("Error", "La prematricula no se pudo registrar");
	        FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		
	}

	/*Metodos de Inicio de Sesion*/
	public String iniciarSesion(){
		
		String ruta = "index";		
		//UsuarioEntity usu = service_session.getUsuario(usuario.getUsername(), usuario.getPassword());
		if(LDAP()){
			UsuarioEntity usu = null;
			
			if(!usuario.getCodigo().isEmpty()){
				usu = service_session.CargarDocente(usuario.getCodigo());
				if(usu != null){
					if(usu.getPrivilegio().equals("Docente")){
						docente = true;
					}
				}else{
					docente = false;
				}
			}
			
			if(!docente){
				usu = service_session.CargarEstudiante(usuario.getCodigo());
			}
			
			if(usu != null){
				usuario = usu;
				if(usuario.getPrivilegio().equals("Estudiante")){
					this.prematriculaRealizada = service_prematricula.getEstadoPrematricula(usu.getCodigo());
					this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
					materias_historia = service_historia.getMaterias(usuario.getCodigo());
					materias_prematricula = service_prematricula.getMaterias(usuario.getCodigo(), this.materias_historia, this.programa);
					ruta = "main?faces-redirect=true";
				}else{
					obenerPeriodosAcademicos();
					cargarReportePrematricula();
					this.ruta = "/Coordinador/ReportePrematricula.xhtml";
					ruta = "mainCoordinador?faces-redirect=true";
				}
			}
		}
		
		return ruta;
	}
	
	private boolean LDAP(){
		return true; //TODO Autenticacion con LDAP
	}
	
	public void validacion(){
		/*if(usuario.getUsername().isEmpty() || usuario.getPassword().isEmpty() || usuario.getCodigo().isEmpty()){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Advertencia!", "Todos los campos son obligatorios"));
		}*/
		
		if(usuario.getCodigo().isEmpty() || this.programa.isEmpty()){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Advertencia!", "Todos los campos son obligatorios"));
		}
		
	}
	public String cerrarSesion(){
		this.ruta = "/Estudiante/HistoriaAcademica.xhtml";
		valuesToNull();
		return "index?faces-redirect=true";
	}

	// Metodos de Coordinador
	private void cargarReportePrematricula(){
		materiasReporte = new ArrayList<PrematriculaBD>();
		materiasReporte.clear();
		materiasReporte = service_reporte.getReporte(new Date(), Integer.parseInt(this.usuario.getOidPrograma()));
	}
	
	private void valuesToNull(){
		this.estadoPrematricula = false;
		this.prematriculaRealizada = false;
		this.materias_historia = null;
		this.materias_prematricula = new ArrayList<MateriaEntity>();
		this.materias_prematricula.clear();
		this.materiasReporte = null;
		this.ruta = "";
		this.usuario = new UsuarioEntity();
	}
	
	public void obenerPeriodosAcademicos(){
		periodosAcademicos = new ArrayList<String>();
		Calendar c = Calendar.getInstance();
		int anio = 2016;
		int periodo = 1;
		String cadena = "";
		
		while(anio<=c.get(Calendar.YEAR) && periodo <= getPeriodo(c.get(Calendar.MONTH))){
			cadena = periodo +" - " + anio;
			periodosAcademicos.add(cadena);
			if(periodo == 1){
				periodo = 2;
			}else{
				periodo = 1;
				anio++;
			}
		}
		periodoAcademico = cadena;
	}
	
	private int getPeriodo(int m){
		if(m<=5){
			return 1;
		}else{
			return 2;
		}
	}
	
	private void cargarProgramas(){
		this.programas = new ArrayList<String>();
		this.programas.add(C.PROGRAMA_SISTEMAS_STR);
		this.programas.add(C.PROGRAMA_ELECTRONICA_STR);
		this.programas.add(C.PROGRAMA_AUTOMATICA_STR);
		this.programas.add(C.PROGRAMA_TELEMATICA_STR);
	}
}
