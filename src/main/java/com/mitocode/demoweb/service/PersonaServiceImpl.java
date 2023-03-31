package com.mitocode.demoweb.service;

import com.mitocode.demoweb.repository.IPersonaRepo;
import com.mitocode.demoweb.repository.PersonaRepoImpl;;

public class PersonaServiceImpl implements IPersonaService {

    private IPersonaRepo repo;

    @Override
    public void registrar(String nombre) {
        IPersonaRepo repo = new PersonaRepoImpl();
        repo.registrar(nombre);        
    }
    
}
