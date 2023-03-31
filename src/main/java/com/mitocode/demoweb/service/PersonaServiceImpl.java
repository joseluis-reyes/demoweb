package com.mitocode.demoweb.service;

import com.mitocode.demoweb.repository.IPersonaRepo;
import com.mitocode.demoweb.repository.PersonaRepoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// implementación de Lógica de Negocios
@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaRepo repo;

    @Override
    public void registrar(String nombre) {
        repo.registrar(nombre);        
    }
    
}
