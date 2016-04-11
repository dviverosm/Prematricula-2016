package co.edu.unicauca.prematricula.entities;

public class Materia implements Bean {
	
	private double periodo;
	private int id_materia;
	private String materia;
	private int creditos;
	private int intensidadHoraria;
	private int semestre;
	private double nota;
	private double habilitacion;
	private double definitiva;
	private String tipo;
	private boolean elegida;
	
	public Materia(double periodo, int id_materia, String materia,
			int creditos, int intensidadHoraria, int semestre, double nota, double habilitacion,
			double definitiva, String tipo) {
		super();
		this.periodo = periodo;
		this.id_materia = id_materia;
		this.materia = materia;
		this.creditos = creditos;
		this.intensidadHoraria = intensidadHoraria;
		this.semestre = semestre;
		this.nota = nota;
		this.habilitacion = habilitacion;
		this.definitiva = definitiva;
		this.tipo = tipo;
		this.elegida = false;
	}

	public double getPeriodo() {
		return periodo;
	}

	public void setPeriodo(double periodo) {
		this.periodo = periodo;
	}

	public int getId_materia() {
		return id_materia;
	}

	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getHabilitacion() {
		return habilitacion;
	}

	public void setHabilitacion(double habilitacion) {
		this.habilitacion = habilitacion;
	}

	public double getDefinitiva() {
		return definitiva;
	}

	public void setDefinitiva(double definitiva) {
		this.definitiva = definitiva;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIntensidadHoraria() {
		return intensidadHoraria;
	}

	public void setIntensidadHoraria(int intensidadHoraria) {
		this.intensidadHoraria = intensidadHoraria;
	}

	public boolean isElegida() {
		return elegida;
	}

	public void setElegida(boolean elegida) {
		this.elegida = elegida;
	}
	
	
}
