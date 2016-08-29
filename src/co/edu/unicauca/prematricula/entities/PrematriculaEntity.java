package co.edu.unicauca.prematricula.entities;

public class PrematriculaEntity {
	
	private int id;
	private int usuarioId;
	private int materiaId;
	private String fecha;
	private String codigo;
	private String nombre;
	private int semestre;
	private int estudiantes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	public int getMateriaId() {
		return materiaId;
	}
	public void setMateriaId(int materiaId) {
		this.materiaId = materiaId;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public int getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(int estudiantes) {
		this.estudiantes = estudiantes;
	}
	public String prematriculaToJson(){
		return "{\"usuario_id\":"+usuarioId+",\"materia_id\":"+materiaId+",\"pre_fecha\":\""+fecha+"\"}";		 
	}
}
