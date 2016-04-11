package co.edu.unicauca.prematricula.entities;

public class Creditos {

	private int semestre;
	private int matriculados;
	
	public Creditos(){
		semestre = 0;
		matriculados = 0; 
	}
	
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public int getMatriculados() {
		return matriculados;
	}
	public void setMatriculados(int matriculados) {
		this.matriculados = matriculados;
	}
	
	
	
}
