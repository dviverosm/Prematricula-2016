package co.edu.unicauca.prematricula.connection;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

import co.edu.unicauca.prematricula.entities.PrematriculaEntity;

public class PrematriculaNet {
	
	HttpConnection con;
	
	public PrematriculaNet(){
		con = new HttpConnection();
	}
	
	public boolean registrarPrematricula(List<PrematriculaEntity> data){
		
		boolean result = true;
		
		String url = con.getUrlBase() + "prematricula";
		for (PrematriculaEntity p : data) {
			String rta = con.requestByJsonPost(url, p.prematriculaToJson());
			if(!rta.contains("OK")){
				result = false;
			}
		}
		
		return result;
	}
	
public List<PrematriculaEntity> getMateriasReporte() throws JSONException{
		
		String url = con.getUrlBase() + "prematricula";
		List<PrematriculaEntity> data = new ArrayList<PrematriculaEntity>();
		
		String rta = con.requestByGet(url);
		JSONArray jsonArray = new JSONArray(rta);
		for(int i=0; i<jsonArray.length(); i++){
			JSONObject json = jsonArray.getJSONObject(i);
			PrematriculaEntity p = new PrematriculaEntity();
			p.setId(Integer.parseInt(json.getString("pre_id")));
			p.setUsuarioId(Integer.parseInt(json.getString("usuario_id")));
			p.setMateriaId(Integer.parseInt(json.getString("materia_id")));
			p.setFecha(json.getString("pre_fecha"));
			p.setCodigo(json.getString("mat_codigo"));
			p.setNombre(json.getString("mat_nombre"));
			p.setSemestre(Integer.parseInt(json.getString("mat_semestre")));
			p.setEstudiantes(0);
			data.add(p);
		}
		return data;
	}
}
