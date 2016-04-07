package com.unicauca.prematricula.entities;

public class Materia implements Bean {
	
	private String codigo;
	private String nombre;
	private int intensidadHoraria;
	private int creditos;
	
	public Materia(String codigo, String nombre, int intensidadHoraria,
			int creditos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.intensidadHoraria = intensidadHoraria;
		this.creditos = creditos;
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
	public int getIntensidadHoraria() {
		return intensidadHoraria;
	}
	public void setIntensidadHoraria(int intensidadHoraria) {
		this.intensidadHoraria = intensidadHoraria;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	
}
