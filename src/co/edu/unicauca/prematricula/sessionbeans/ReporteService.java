package co.edu.unicauca.prematricula.sessionbeans;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import co.edu.unicauca.prematricula.dao.PrematriculaDao;
import co.edu.unicauca.prematricula.entities.PrematriculaBD;

@ManagedBean(name="reporteService")
@ApplicationScoped
public class ReporteService 
{
	
	public List<PrematriculaBD> getReporte(Date date, int oid){
		String fini = fechaInicio(date);
		String ffin = fechaFin(date);
		List<PrematriculaBD> result = PrematriculaDao.readPrematricula(fini, ffin, oid);
		
		return result;
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
