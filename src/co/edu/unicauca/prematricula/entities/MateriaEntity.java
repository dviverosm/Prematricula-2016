package co.edu.unicauca.prematricula.entities;

public class MateriaEntity {
	
	private int id;
	private String codigo;
	private int correquisito;
	private String nombre;
	private String semestre;
	private int creditos;
	private String tipoMateria;
	private float nota;
	private String habilitacion;
	private float definitiva;
	private String periodoAprobada; 
	private String tipoAprobada;
	
	public MateriaEntity(){
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCorrequisito() {
		return correquisito;
	}

	public void setCorrequisito(int correquisito) {
		this.correquisito = correquisito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getTipoMateria() {
		return tipoMateria;
	}

	public void setTipoMateria(String tipoMateria) {
		this.tipoMateria = tipoMateria;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getHabilitacion() {
		return habilitacion;
	}

	public void setHabilitacion(String habilitacion) {
		this.habilitacion = habilitacion;
	}

	public float getDefinitiva() {
		return definitiva;
	}

	public void setDefinitiva(float definitiva) {
		this.definitiva = definitiva;
	}

	public String getPeriodoAprobada() {
		return periodoAprobada;
	}

	public void setPeriodoAprobada(String periodoAprobada) {
		this.periodoAprobada = periodoAprobada;
	}

	public String getTipoAprobada() {
		return tipoAprobada;
	}

	public void setTipoAprobada(String tipoAprobada) {
		this.tipoAprobada = tipoAprobada;
	}
	
	
}
