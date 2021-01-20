package com.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.modelos.Practicas;

@Repository
public interface Interfacepracticas extends CrudRepository<Practicas, Integer>{
	
}
