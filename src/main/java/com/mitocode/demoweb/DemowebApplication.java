package com.mitocode.demoweb;

import org.slf4j.Logger; // Dependency: org.slf4j	log4j-over-slf4j
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.demoweb.service.IPersonaService;
import com.mitocode.demoweb.service.PersonaServiceImpl;

@SpringBootApplication
public class DemowebApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(DemowebApplication.class);
	
	@Autowired
	private IPersonaService service;
	//private PersonaServiceImpl service;

	public static void main(String[] args) {
		SpringApplication.run(DemowebApplication.class, args);
		LOGGER.info("Aplicación iniciada!");

		IPersonaService service = new PersonaServiceImpl();
		service.registrar("Hola");
	}
}
