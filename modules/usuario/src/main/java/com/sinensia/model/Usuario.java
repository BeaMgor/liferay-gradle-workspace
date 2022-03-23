package com.sinensia.model;

public class Usuario {
	
	
	private String nombre;
    private String apellido;
    private String dni;
    private String idUsuario;
    
    public Usuario() {
    	
    }

	public Usuario(String nombre, String apellido, String dni, String idUsuario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.idUsuario = dni;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
    
    

}
