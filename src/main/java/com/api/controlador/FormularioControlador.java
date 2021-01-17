package com.api.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.modelos.Formulario;
import com.api.repositorio.InterfaceFormulario;

@RestController
@RequestMapping("/Formulario")
public class FormularioControlador {

	@Autowired
	private InterfaceFormulario interfaceForm;
	
	@GetMapping
	public List<Formulario> forms(){
		return (List<Formulario>) interfaceForm.findAll();
	}
}
