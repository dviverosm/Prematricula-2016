package com.unicauca.prematricula.managedbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import com.unicauca.prematricula.entities.*;
import com.unicauca.prematricula.sessionbeans.*;


@ManagedBean(name="dtMateria")
@SessionScoped
public class MateriaMB {
	
	@ManagedProperty("#{materiaService}")
	private MateriaService service;
	
	private List<Materia> materias;
	
	public MateriaMB(){
		this.service = new MateriaService();
		materias = service.obtenerMaterias();
	}
	
	@PostConstruct
	public void init(){
		this.service = new MateriaService();
		materias = service.obtenerMaterias();
	}
	
	public List<Materia> getMaterias(){
		return this.materias;
	}
	
	public void setService(MateriaService service){
		this.service = service;
	}
}
