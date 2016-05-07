package co.edu.unicauca.prematricula.sessionbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import co.edu.unicauca.prematricula.connection.PrematriculaNet;
import co.edu.unicauca.prematricula.entities.PrematriculaEntity;

@ManagedBean(name="reporteService")
@ApplicationScoped
public class ReporteService {
	
	public List<PrematriculaEntity> getReporte(){
		PrematriculaNet prematriculaNet = new PrematriculaNet();
		List<PrematriculaEntity> result = new ArrayList<PrematriculaEntity>();
		List<PrematriculaEntity> data = prematriculaNet.getMateriasReporte();
		result.add(data.get(0));
		for (PrematriculaEntity d : data) {
			boolean flag = false;
			for (PrematriculaEntity r : result) {
				if(d.getCodigo().equals(r.getCodigo())){
					flag = true;
					r.setEstudiantes(r.getEstudiantes()+1);
					break;
				}
			}
			if(!flag){
				d.setEstudiantes(1);
				result.add(d);
			}
		}
		
		
		return result;
	}
}
