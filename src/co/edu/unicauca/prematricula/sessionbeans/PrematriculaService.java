package co.edu.unicauca.prematricula.sessionbeans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import co.edu.unicauca.prematricula.connection.MateriaNet;
import co.edu.unicauca.prematricula.connection.PrematriculaNet;
import co.edu.unicauca.prematricula.entities.MateriaEntity;
import co.edu.unicauca.prematricula.entities.PrematriculaEntity;

@ManagedBean(name="prematriculaService")
@ApplicationScoped
public class PrematriculaService {
	
	public List<MateriaEntity> getMaterias(int usr){
		MateriaNet materiaNet = new MateriaNet();
		return materiaNet.getMateriasFaltantes(usr);
	}
	
	public boolean setPrematricula(int usr, List<MateriaEntity> materias){
		List<PrematriculaEntity> data = new ArrayList<PrematriculaEntity>();
		for (MateriaEntity m : materias) {
			PrematriculaEntity p = new PrematriculaEntity();
			p.setUsuarioId(usr);
			p.setMateriaId(m.getId());
			Calendar c = Calendar.getInstance();
			String fecha = c.get(Calendar.YEAR)+"-"+c.get(Calendar.MONTH)+"-"+c.get(Calendar.DATE);
			p.setFecha(fecha);
			data.add(p);
		}
		
		PrematriculaNet prematriculaNet = new PrematriculaNet();
		return prematriculaNet.registrarPrematricula(data);
	}
}
