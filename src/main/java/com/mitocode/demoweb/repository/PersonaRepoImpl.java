package com.mitocode.demoweb.repository;

import org.slf4j.Logger; // Dependency: org.slf4j	log4j-over-slf4j
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mitocode.demoweb.DemowebApplication;

// Etiqueta de Repositorio
@Repository
public class PersonaRepoImpl implements IPersonaRepo {

	private static Logger LOG = LoggerFactory.getLogger(DemowebApplication.class);
	
	@Override
	public void registrar(String nombre) {
		LOG.info("Se registró a {}", nombre);
	}
	
}
