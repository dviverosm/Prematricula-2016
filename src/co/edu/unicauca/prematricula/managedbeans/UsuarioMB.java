package co.edu.unicauca.prematricula.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import co.edu.unicauca.prematricula.entities.Usuario;
import co.edu.unicauca.prematricula.sessionbeans.InicioSesionService;



@ManagedBean(name="usuarioController")
@SessionScoped
public class UsuarioMB {
	
	@ManagedProperty("#{inicioSesionService}")
	private InicioSesionService service;
	public void setService(InicioSesionService service){
		this.service = service;
	}
		
	
	private Usuario usuario;
	
	public UsuarioMB(){
		this.service = new InicioSesionService();
		usuario = new Usuario();
	}
	
	@PostConstruct
	public void init(){
		this.service = new InicioSesionService();
		usuario = new Usuario();
	}
	
	public String iniciarSesion(){
		String ruta = "index";
		
		System.out.println("usuarioController: iniciarSesion");
		if(service.comprobarCredenciales(usuario)){
			ruta = "Estudiante/materias_pendientes?faces-redirect=true";
		}
		
		return ruta;
	}
	
	public void validacion(){
		System.out.println("usuarioController: validacion");
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public co.edu.unicauca.prematricula.sessionbeans.InicioSesionService getService() {
		return service;
	}

	public void setUsuario(co.edu.unicauca.prematricula.entities.Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
