package co.edu.unicauca.prematricula.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import co.edu.unicauca.prematricula.entities.UsuarioEntity;
import co.edu.unicauca.prematricula.sessionbeans.InicioSesionService;


@ManagedBean(name="usuarioController")
@SessionScoped
public class UsuarioController {

	@ManagedProperty("#{inicioSesionService}")
	private InicioSesionService service;
	
	public void setService(InicioSesionService service){
		this.service = service;
	}
	
	UsuarioEntity usuario;
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}


	@PostConstruct
	public void init(){
		this.service = new InicioSesionService();
		usuario = new UsuarioEntity();
	}
	
	public String iniciarSesion(){
		String ruta = "index";
		
		UsuarioEntity usu = service.getUsuario(usuario.getUsername(), usuario.getPassword());
		if(service.comprobarCredenciales(usu)){
			usuario = usu;
			ruta = "main?faces-redirect=true";
		}
		
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
	
}
