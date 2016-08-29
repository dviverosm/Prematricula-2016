package co.edu.unicauca.prematricula.entities;

import java.util.Date;

public class PrematriculaBD {

	//Atributos de Prematricula
	private int preId;
	private Date preFecha;
	private int preInscritos;
	
	//Atributos de Materia	
	private int matId;
	private String matCodigo;
	private String matNombre;
	private int matSemestre;
	private int matPrograma;
	
	//Atributos de usuario
	private int usuCodigo;
	private String usuNombre;
	
	public PrematriculaBD(){
		
	}

	public int getPreId() {
		return preId;
	}

	public void setPreId(int preId) {
		this.preId = preId;
	}

	public Date getPreFecha() {
		return preFecha;
	}

	public void setPreFecha(Date preFecha) {
		this.preFecha = preFecha;
	}

	public int getPreInscritos() {
		return preInscritos;
	}

	public void setPreInscritos(int preInscritos) {
		this.preInscritos = preInscritos;
	}

	public int getMatId() {
		return matId;
	}

	public void setMatId(int matId) {
		this.matId = matId;
	}

	public String getMatCodigo() {
		return matCodigo;
	}

	public void setMatCodigo(String matCodigo) {
		this.matCodigo = matCodigo;
	}

	public String getMatNombre() {
		return matNombre;
	}

	public void setMatNombre(String matNombre) {
		this.matNombre = matNombre;
	}

	public int getMatSemestre() {
		return matSemestre;
	}

	public void setMatSemestre(int matSemestre) {
		this.matSemestre = matSemestre;
	}

	public int getMatPrograma() {
		return matPrograma;
	}

	public void setMatPrograma(int matPrograma) {
		this.matPrograma = matPrograma;
	}

	public int getUsuCodigo() {
		return usuCodigo;
	}

	public void setUsuCodigo(int usuCodigo) {
		this.usuCodigo = usuCodigo;
	}

	public String getUsuNombre() {
		return usuNombre;
	}

	public void setUsuNombre(String usuNombre) {
		this.usuNombre = usuNombre;
	}
	
	
}
