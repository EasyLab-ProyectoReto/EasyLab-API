package com.api.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.modelos.Practicas;
import com.api.repositorio.Interfacepracticas;

@RestController
@RequestMapping("practicas")
public class practicasControlador {

	@Autowired
	private Interfacepracticas interfaceForm;
	
	@GetMapping
	public List<Practicas> forms(){
		return (List<Practicas>) interfaceForm.findAll();
	}
}
