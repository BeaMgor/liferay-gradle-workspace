package com.sinensia.utilities;

import com.sinensia.model.Usuario;

import java.util.List;
import java.util.ArrayList;

public class UsuarioSingleton {
	
	private static ArrayList<Usuario> instancia;
	
	public static List<Usuario> getInstance() {
		
		if (instancia != null) {
			instancia = new ArrayList<Usuario>();
		}
		return instancia;
	}
	

}
