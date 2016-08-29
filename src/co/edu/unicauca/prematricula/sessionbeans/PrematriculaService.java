package co.edu.unicauca.prematricula.sessionbeans;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.rpc.ServiceException;

import co.edu.unicauca.prematricula.connection.MateriaNet;
import co.edu.unicauca.prematricula.dao.PrematriculaDao;
import co.edu.unicauca.prematricula.entities.MateriaEntity;
import co.edu.unicauca.prematricula.entities.PrematriculaBD;
import co.edu.unicauca.prematricula.entities.UsuarioEntity;
import co.edu.unicauca.prematriculas.control.MateriaPensum;
import co.edu.unicauca.prematriculas.control.Nota;
import co.edu.unicauca.prematriculas.control.PrematriculasControl;
import co.edu.unicauca.prematriculas.control.PrematriculasControlServiceLocator;

@ManagedBean(name="prematriculaService")
@ApplicationScoped
public class PrematriculaService {
	
	public List<MateriaEntity> getMaterias(String usr, List<MateriaEntity> historia, String oidPrograma){
		
		List<MateriaEntity> result = new ArrayList<MateriaEntity>();
		PrematriculasControlServiceLocator locator = new PrematriculasControlServiceLocator();
		try {
			PrematriculasControl wservice = locator.getPrematriculasControlPort();
			try {
				String arg = ""+usr;
				MateriaPensum[] data = wservice.cargarPensum(arg);
				for(int i=0; i<data.length; i++){
					if(!materiaCursada(data[i].getOidmateria(), historia)){
						MateriaEntity materia = new MateriaEntity();
						materia.setCodigo(Integer.toString(data[i].getOidmateria()));
						materia.setNombre(data[i].getMateria());
						materia.setCreditos(data[i].getCreditos());
						materia.setSemestre(Integer.toString(data[i].getSemestre()));
						materia.setOidPrograma(oidPrograma);
						result.add(materia);						
					}
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
		return materiaNet.getMateriasFaltantes(usr);*/
	}
	
	private boolean materiaCursada(int oid, List<MateriaEntity> historia){
		boolean result = false;
		for(MateriaEntity m : historia){
			if(m.getCodigo().equals(Integer.toString(oid))){
				result = true;
				break;
			}
		}
		return result;
	}
	
	public boolean setPrematricula(UsuarioEntity usr, List<MateriaEntity> materias){

		boolean result = false;
		
		for (MateriaEntity m : materias) {
			PrematriculaBD p = new PrematriculaBD();
			p.setMatCodigo(m.getCodigo());
			p.setMatNombre(m.getNombre());
			p.setMatSemestre(Integer.parseInt(m.getSemestre()));
			p.setMatPrograma(Integer.parseInt(m.getOidPrograma())); 
			p.setUsuCodigo(Integer.parseInt(usr.getCodigo()));
			p.setUsuNombre(usr.getNombre());
			p.setPreFecha(new Date());
			try {
				PrematriculaDao.createPrematricula(p);
				result = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
	public boolean getEstadoPrematricula(String codigo){
		String fini = fechaInicio(new Date());
		String ffin = fechaFin(new Date());
		return PrematriculaDao.realizoPrematricula(codigo, fini, ffin);
	}
	
	private String fechaInicio(Date date){
		String fecha ="";
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		if(c.get(Calendar.MONTH)<=5){
			fecha = "01/01/"+c.get(Calendar.YEAR);
		}else{
			fecha = "01/07/"+c.get(Calendar.YEAR);
		}
		
		return fecha;
	}
	
	private String fechaFin(Date date){
		String fecha ="";
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		if(c.get(Calendar.MONTH)<=5){
			fecha = "30/06/"+c.get(Calendar.YEAR);
		}else{
			fecha = "31/12/"+c.get(Calendar.YEAR);
		}
		
		return fecha;
	}
}
