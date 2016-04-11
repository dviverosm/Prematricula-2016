package co.edu.unicauca.prematricula.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;

import co.edu.unicauca.prematricula.entities.Creditos;
import co.edu.unicauca.prematricula.entities.Materia;
import co.edu.unicauca.prematricula.sessionbeans.MateriaService;

@ManagedBean(name="prematriculaController")
@SessionScoped
public class ProcesoPrematriculaMB {

	@ManagedProperty("#{materiaService}")
	private MateriaService service;
	
	private boolean skip;
	private List<Materia> materias;
	private List<Materia> materiasSeleccionadas;
	private List<Creditos> totalCreditos;
	
	public ProcesoPrematriculaMB(){
		this.service = new MateriaService();
		materias = service.obtenerMaterias();
		materiasSeleccionadas = new ArrayList<Materia>();
		totalCreditos = new ArrayList<Creditos>();
		selectMat();
	}
	
	@PostConstruct
	public void init(){
		this.service = new MateriaService();
		materias = service.obtenerMaterias();
		materiasSeleccionadas = new ArrayList<Materia>();
		totalCreditos = new ArrayList<Creditos>();
		selectMat();
	}
	
	public void selectMat(){
		Creditos creditos = new Creditos();
		for (Materia m : materias) {
			creditos.setSemestre(creditos.getSemestre()+m.getCreditos());
			if(m.isElegida()){
				creditos.setMatriculados(creditos.getMatriculados()+m.getCreditos());
			}
		}
		totalCreditos.clear();
		totalCreditos.add(creditos);
		seleccionadas();
	}
	
	public String onFlowProcess(FlowEvent event){
		if(skip){
			skip = false;
			return "confirm";
		}else{
			return event.getNewStep();
		}
	}
	
	public void seleccionadas(){
		materiasSeleccionadas.clear();
		for (Materia m : materias) {
			if(m.isElegida()){
				materiasSeleccionadas.add(m);
			}
		}
	}
	
	public void save(){
		FacesMessage msg = new FacesMessage("Successful", "Welcome :");
        FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public boolean isSkip() {
		return skip;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setService(MateriaService service) {
		this.service = service;
	}

	public List<Creditos> getTotalCreditos() {
		return totalCreditos;
	}

	public void setTotalCreditos(List<Creditos> totalCreditos) {
		this.totalCreditos = totalCreditos;
	}

	public List<Materia> getMateriasSeleccionadas() {
		return materiasSeleccionadas;
	}

	public void setMateriasSeleccionadas(List<Materia> materiasSeleccionadas) {
		this.materiasSeleccionadas = materiasSeleccionadas;
	}
}
