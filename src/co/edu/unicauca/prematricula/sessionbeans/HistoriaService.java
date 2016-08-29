package co.edu.unicauca.prematricula.sessionbeans;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import co.edu.unicauca.prematricula.connection.MateriaNet;
import co.edu.unicauca.prematricula.entities.MateriaEntity;
import co.edu.unicauca.prematriculas.control.*;

@ManagedBean(name="historiaService")
@ApplicationScoped
public class HistoriaService
{
	
	public List<MateriaEntity> getMaterias(String usr){	
		
		List<MateriaEntity> result = new ArrayList<MateriaEntity>();
		PrematriculasControlServiceLocator locator = new PrematriculasControlServiceLocator();
		try {
			PrematriculasControl wservice = locator.getPrematriculasControlPort();
			try 
			{
				String arg = usr;
				Nota[] data = wservice.cargarHistoriaAcademica(arg);
				for(int i=0; i<data.length; i++){
					MateriaEntity materia = new MateriaEntity();
					materia.setCodigo(data[i].getOidMateria());
					materia.setNombre(data[i].getMateria());
					materia.setPeriodoAprobada(data[i].getPeriodo());
					materia.setCreditos(Integer.parseInt(data[i].getCreditos()));
					materia.setSemestre(data[i].getSemestre());
					materia.setNota(data[i].getNota());
					materia.setHabilitacion(data[i].getHabilitacion());
					materia.setDefinitiva(data[i].getDefinitiva());
					materia.setTipoAprobada(data[i].getTiponota());
					result.add(materia);
				}
			} catch (RemoteException e) {
				e.printStackTrace();
				return null;
			}
		} catch (ServiceException e2) {
			e2.printStackTrace();
			return null;
		} 		
		
		return result;
		/*MateriaNet materiaNet = new MateriaNet();
		return materiaNet.getHistoriaAcademica(usr);*/
	}
	
	
	
}
