package co.edu.unicauca.prematricula.sessionbeans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import co.edu.unicauca.prematricula.entities.Usuario;

@ManagedBean(name="inicioSesionService")
@ApplicationScoped
public class InicioSesionService {

	public InicioSesionService(){}
	
	public boolean comprobarCredenciales(Usuario u){
		System.out.println("inicioSesionService: comprobarCredenciales");
		boolean result = false;
		
		//Credenciales de prueba
		String usuario = "admin";
		String password = "admin";
		
		boolean user = false, pass = false;
		if(u.getUsuario().equals(usuario)){
			user = true;
			if(u.getPassword().equals(password)){
				pass = true;
			}else{
				pass = false;
			}
		}else{
			user = false;
		}
		result = user && pass;
		
		return result;
	}
	
}
