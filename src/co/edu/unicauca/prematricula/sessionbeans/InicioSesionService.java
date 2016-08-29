package co.edu.unicauca.prematricula.sessionbeans;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.rpc.ServiceException;

import org.primefaces.json.JSONException;

import co.edu.unicauca.prematricula.connection.UsuarioNet;
import co.edu.unicauca.prematricula.entities.MateriaEntity;
import co.edu.unicauca.prematricula.entities.UsuarioEntity;
import co.edu.unicauca.prematriculas.control.Docente;
import co.edu.unicauca.prematriculas.control.Estudiante;
import co.edu.unicauca.prematriculas.control.Nota;
import co.edu.unicauca.prematriculas.control.PrematriculasControl;
import co.edu.unicauca.prematriculas.control.PrematriculasControlServiceLocator;

@ManagedBean(name="inicioSesionService")
@ApplicationScoped
public class InicioSesionService {

	public InicioSesionService(){}
	
	public boolean comprobarCredenciales(UsuarioEntity u){
		boolean flag = (u.getDocumento() != -1);
		return flag;
	}
	
	public UsuarioEntity getUsuario(String usr, String pass) throws JSONException{
		UsuarioNet usuarioNet = new UsuarioNet();
		UsuarioEntity rta = usuarioNet.startSession(usr, pass);
		if(rta.getDocumento() != -1 && rta.getPrivilegio().equals("Estudiante")){
			rta.setPrograma(usuarioNet.programaUsuario(rta.getDocumento()));
		}
		return rta;
	}
	
	public UsuarioEntity CargarEstudiante(String codigo){
		UsuarioEntity usuarioEntity = null;
		PrematriculasControlServiceLocator locator = new PrematriculasControlServiceLocator();
		try {
			PrematriculasControl wservice = locator.getPrematriculasControlPort();
			try {
				String arg = ""+codigo;
				Estudiante est = wservice.cargarDatosEstudiante(arg);
				usuarioEntity = new UsuarioEntity();
				usuarioEntity.setCodigo(codigo);
				String nombre = est.getPrimerNombre() +" "+ est.getSegundoNombre() +" "+ est.getPrimerApellido();
				usuarioEntity.setNombre(nombre);
				usuarioEntity.setDocumento(Integer.parseInt(est.getIdentificacion()));
				usuarioEntity.setTipoDocumento(est.getTipoIdentificacion().getValue());
				Calendar c = est.getFechaNacimiento();
				String fNac = c.get(Calendar.YEAR)+" - "+c.get(Calendar.MONTH)+" - "+c.get(Calendar.DATE);
				usuarioEntity.setFechaNacimiento(fNac);
				usuarioEntity.setEstado(est.getEstado());
				usuarioEntity.setPrivilegio("Estudiante");
			} catch (RemoteException e) {
				e.printStackTrace();
				return null;
			}
		} catch (ServiceException e2) {
			e2.printStackTrace();
			return null;
		} 	
		return usuarioEntity;
	}
	
	public UsuarioEntity CargarDocente(String documento){
		UsuarioEntity usuarioEntity = null;
		PrematriculasControlServiceLocator locator = new PrematriculasControlServiceLocator();
		try {
			PrematriculasControl wservice = locator.getPrematriculasControlPort();
			try {
				String arg = "" + documento;
				Docente doc = wservice.cargarDatosDocente(arg);
				usuarioEntity = new UsuarioEntity();
				usuarioEntity.setPrograma(doc.getProgramaCoordinado());
				usuarioEntity.setOidPrograma(doc.getOidProgramaCoordinado());
				usuarioEntity.setPrivilegio("Docente");
			} catch (RemoteException e) {
				e.printStackTrace();
				return null;
			}
		} catch (ServiceException e2) {
			e2.printStackTrace();
			return null;
		} 	
		return usuarioEntity;
	}
	
}
