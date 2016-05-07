package co.edu.unicauca.prematricula.connection;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;

import co.edu.unicauca.prematricula.entities.MateriaEntity;

public class MateriaNet {

	HttpConnection con;
	
	public MateriaNet(){
		con = new HttpConnection();
	}
	
	public List<MateriaEntity> getMateriasFaltantes(int usr){
		
		String url = con.getUrlBase() + "materias/faltantes/"+usr;
		List<MateriaEntity> data = new ArrayList<MateriaEntity>();
		
		String rta = con.requestByGet(url);
		JSONArray jsonArray = new JSONArray(rta);
		for(int i=0; i<jsonArray.length(); i++){
			JSONObject json = jsonArray.getJSONObject(i);
			MateriaEntity m = new MateriaEntity();
			m.setId(Integer.parseInt(json.getString("mat_id")));
			m.setCodigo(json.getString("mat_codigo"));
			m.setNombre(json.getString("mat_nombre"));
			String s = json.getString("mat_semestre");
			if(s.equals("0")){
				s = " - ";
			}
			m.setSemestre(s);
			m.setCreditos(Integer.parseInt(json.getString("mat_creditos")));
			data.add(m);
		}
		return data;
	}
	
	public List<MateriaEntity> getHistoriaAcademica(int usr){
		
		String url = con.getUrlBase() + "materias/historia/"+usr;
		List<MateriaEntity> data = new ArrayList<MateriaEntity>();
		
		String rta = con.requestByGet(url);
		JSONArray jsonArray = new JSONArray(rta);
		for(int i=0; i<jsonArray.length(); i++){
			JSONObject json = jsonArray.getJSONObject(i);
			MateriaEntity m = new MateriaEntity();
			m.setId(Integer.parseInt(json.getString("mat_id")));
			m.setPeriodoAprobada(json.getString("apr_periodo"));
			m.setCodigo(json.getString("mat_codigo"));
			m.setNombre(json.getString("mat_nombre"));
			m.setCreditos(Integer.parseInt(json.getString("mat_creditos")));
			String s = json.getString("mat_semestre");
			if(s.equals("0")){
				s= "-";
			}
			m.setSemestre(s);
			m.setNota(Float.parseFloat(json.getString("apr_nota")));
			String h = "";
			if(!json.isNull("apr_habilitacion")){
				h = json.getString("apr_habilitacion");
				if(h.length()==1){
					h += ".0";
				}
			}
			m.setHabilitacion(h);
			m.setDefinitiva(Float.parseFloat(json.getString("apr_definitiva")));
			m.setTipoAprobada(json.getString("apr_tipo"));
			
			data.add(m);
		}
		return data;
	}
	
}
