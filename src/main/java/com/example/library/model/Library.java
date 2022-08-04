package com.example.library.model;

import lombok.Data;

public @Data class Library {

	private String Nombre;
	private String Direccion;
	private String Telefono;
	private String Horario;
	public Library(){
		
	}
	

	public Library(String nombre, String direccion, String telefono, String horario) {
		Nombre = nombre;
		Direccion = direccion;
		Telefono = telefono;
		Horario = horario;
	}
	public String getHorario() {
		return Horario;
	}
	public void setHorario(String horario) {
		Horario = horario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	

}
