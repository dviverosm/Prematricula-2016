package co.edu.unicauca.prematricula.managedbeans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import co.edu.unicauca.prematricula.entities.Materia;
import co.edu.unicauca.prematricula.sessionbeans.MateriaService;


@ManagedBean (name="historiaAcademicaController")
@SessionScoped
public class HistoriaAcademica{

	private List<Materia> materias;
    
    @ManagedProperty("#{materiaService}")
    private MateriaService service;
 
    @PostConstruct
    public void init() {
    	this.service = new MateriaService();
        materias = service.obtenerMaterias();
    }
     
    public List<Materia> getMaterias() {
        return materias;
    }
 
    public void setService(MateriaService service) {
        this.service = service;
    }
	
}
