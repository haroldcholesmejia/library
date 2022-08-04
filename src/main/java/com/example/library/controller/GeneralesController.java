package com.example.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Library;

@RestController
@RequestMapping(value = { "generales" })
public class GeneralesController {
	private Library library;
	
	public GeneralesController() {
		library=new Library();
		library.setNombre("harold");
		library.setDireccion("calle 12");
		library.setTelefono("121212");
		library.setHorario("2:00 pm");
		
	}
	
	@GetMapping("/")
	public Library info() {
		return library;
	}
	

	@GetMapping("/nombre")
	public String nombre() {
		return library.getNombre();
	}
	
	@GetMapping("/direccion")
	public String direccion() {
		return library.getDireccion();
	}
	
	

}
