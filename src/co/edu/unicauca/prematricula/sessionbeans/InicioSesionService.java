package co.edu.unicauca.prematricula.sessionbeans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import co.edu.unicauca.prematricula.connection.UsuarioNet;
import co.edu.unicauca.prematricula.entities.UsuarioEntity;

@ManagedBean(name="inicioSesionService")
@ApplicationScoped
public class InicioSesionService {

	public InicioSesionService(){}
	
	public boolean comprobarCredenciales(UsuarioEntity u){
		boolean flag = (u.getDocumento() != -1);
		return flag;
	}
	
	public UsuarioEntity getUsuario(String usr, String pass){
		UsuarioNet usuarioNet = new UsuarioNet();
		UsuarioEntity rta = usuarioNet.startSession(usr, pass);
		if(rta.getDocumento() != -1 && rta.getPrivilegio().equals("Estudiante")){
			rta.setPrograma(usuarioNet.programaUsuario(rta.getDocumento()));
		}
		return rta;
	}
}
