package co.edu.unicauca.prematricula.sessionbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import co.edu.unicauca.prematricula.entities.*;

@ManagedBean(name="materiaService")
@ApplicationScoped
public class MateriaService {
	
	public MateriaService(){}
	
	public List<Materia> obtenerMaterias(){
		List<Materia> list = new ArrayList<Materia>();
        
        list.add(new Materia(2010.2 ,11477, "Introducci�n a la Inform�tica",3,4,1,4.2,0.0,4.2,"Normal"));
        list.add(new Materia(2010.2 ,21961, "Electiva Fish-1",2,4,1,4.5,0.0,4.5,"Normal"));
        list.add(new Materia(2010.2 ,11478, "Laboratorio de Introducci�n a la Inform�tica",1,2,1,4.5,0.0,4.5,"Normal"));
        list.add(new Materia(2010.2 ,11479, "Introducci�n a la Ingenier�a de Sistemas",1,2,1,4.2,0.0,4.2,"Homologacion"));
        list.add(new Materia(2010.2 ,10224, "Lectura y Escritura",2,4,1,4,0.0,4,"Normal"));
        list.add(new Materia(2010.2 ,11465, "Calculo I",4,4,1,3.8,0.0,3.8,"Normal"));
        list.add(new Materia(2010.2 ,11465, "Lectura y Escritura",2,4,1,4,0.0,4,"Normal"));
        
        list.add(new Materia(2011.1 ,11466, "C�lculo II",4,4,2,3.5,0.0,3.5,"Normal"));
        list.add(new Materia(2011.1, 11410, "�lgebra Linea",4,4,2,3.5,0.0,3.5,"Normal"));
        list.add(new Materia(2011.1 ,11473, "Laboratorio de Mec�nica",1,2,2,4,0.0,4,"Normal"));
        list.add(new Materia(2011.1 ,11464, "Mec�nica",3,4,2,4,0.0,4,"Normal"));
        list.add(new Materia(2011.1 ,21962, "Electiva Fish-2",2,4,2,4.5,0.0,4.5,"Normal"));
        list.add(new Materia(2011.1 ,10143, "Programaci�n Orientada a Objetos",3,4,2,4.1,0.0,4.1,"Normal"));
        list.add(new Materia(2011.1 ,10144, "Laboratorio de Programaci�n Orientada a Objeto",1,2,2,4.1,0.0,4.1,"Normal"));
                  
    return list;
	}
}
