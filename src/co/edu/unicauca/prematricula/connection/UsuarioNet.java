package co.edu.unicauca.prematricula.connection;

import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

import co.edu.unicauca.prematricula.entities.UsuarioEntity;

public class UsuarioNet {

	HttpConnection con;
	
	public UsuarioNet(){
		con = new HttpConnection();
	}
	
	public UsuarioEntity startSession(String usr, String pass) throws JSONException{
		
		String url = con.getUrlBase() + "usuario/login/"+usr+"/"+pass;
		UsuarioEntity usuario = new UsuarioEntity();
		
		String rta = con.requestByGet(url);
		if(!rta.equals("")){
			JSONObject json = new JSONObject(rta);
			
			usuario.setId(Integer.parseInt(json.getString("usu_id")));
			usuario.setPrivilegio(json.getString("gru_nombre"));
			usuario.setNombre(json.getString("usu_nombre")+" "+json.getString("usu_primer_apellido"));
			if(!json.isNull("usu_codigo")){
				usuario.setCodigo(json.getString("usu_codigo"));
			}else{
				usuario.setCodigo("");
			}
			usuario.setPrimerApellido(json.getString("usu_primer_apellido"));
			if(!json.isNull("usu_segundo_apellido")){
				usuario.setSegundoApellido(json.getString("usu_segundo_apellido"));			
			}else{
				usuario.setSegundoApellido("");
			}
			usuario.setDocumento(Integer.parseInt(json.getString("usu_documento")));
			usuario.setTipoDocumento(json.getString("usu_tipo_documento"));
			if(!json.isNull("usu_fecha_nacimiento")){
				usuario.setFechaNacimiento(json.getString("usu_fecha_nacimiento"));
			}else{
				usuario.setFechaNacimiento("yyyy-mm-dd");
			}
			if(!json.isNull("usu_estado")){
				usuario.setEstado(json.getString("usu_estado"));
			}else{
				usuario.setEstado("");
			}
			
			if(!json.isNull("usu_foto")){
				usuario.setFoto(json.getString("usu_foto"));
			}else{
				usuario.setFoto("http://i64.tinypic.com/ejai2x.jpg");
			}
		}else{
			usuario.setDocumento(-1);
		}
		
		return usuario;
	}
	
	public String programaUsuario(int documento) throws JSONException{
		String url = con.getUrlBase() + "usuario/programa/"+documento;
		
		String rta = con.requestByGet(url);
		JSONObject json = new JSONObject(rta);
		String programa = json.getString("pro_nombre");
		return programa;
	}
}
