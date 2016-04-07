package com.unicauca.prematricula.sessionbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import com.unicauca.prematricula.entities.*;

@ManagedBean(name="materiaService")
@ApplicationScoped
public class MateriaService {
	
	public MateriaService(){}
	
	public List<Materia> obtenerMaterias(){
		List<Materia> rta = new ArrayList<Materia>();
		
		Materia m1 = new Materia ("cod1", "nom1", 2, 4);
		Materia m2 = new Materia ("cod2", "nom2", 4, 6);
		Materia m3 = new Materia ("cod3", "nom3", 2, 5);
		
		rta.add(m1);
		rta.add(m2);
		rta.add(m3);
		
		return rta;
	}
}
