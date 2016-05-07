package co.edu.unicauca.prematricula.sessionbeans;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import co.edu.unicauca.prematricula.connection.MateriaNet;
import co.edu.unicauca.prematricula.entities.MateriaEntity;

@ManagedBean(name="historiaService")
@ApplicationScoped
public class HistoriaService {

	public List<MateriaEntity> getMaterias(int usr){	
		MateriaNet materiaNet = new MateriaNet();
		return materiaNet.getHistoriaAcademica(usr); // mandar el id del usuario de la sesion
	}
}
