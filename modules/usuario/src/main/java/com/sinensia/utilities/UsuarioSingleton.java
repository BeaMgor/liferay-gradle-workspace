package com.sinensia.utilities;

import com.sinensia.model.Usuario;

import java.util.ArrayList;

public class UsuarioSingleton {
	
	private static UsuarioSingleton instancia;
	private ArrayList<Usuario> lista = null;
	
	
	public static UsuarioSingleton getInstance() {
		
		if (instancia == null) {
			instancia = new UsuarioSingleton();
		}
		return instancia;
	}


	private UsuarioSingleton() {
		lista = new ArrayList<Usuario>();
		
	}

	public ArrayList<Usuario> getLista() {
		return this.lista;
	}


	public void addToArray (Usuario usuario) {
		lista.add(usuario);
	}
	
	
}
