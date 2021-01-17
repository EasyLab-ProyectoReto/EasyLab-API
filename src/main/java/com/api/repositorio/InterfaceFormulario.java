package com.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.modelos.Formulario;

@Repository
public interface InterfaceFormulario extends CrudRepository<Formulario, Integer>{
	
}
