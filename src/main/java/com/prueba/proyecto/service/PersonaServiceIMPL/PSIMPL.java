package com.prueba.proyecto.service.PersonaServiceIMPL;

import com.prueba.proyecto.Entity.Persona;
import com.prueba.proyecto.repository.personaRepo;
import com.prueba.proyecto.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//import org.springFramework.stereotype.Service;
public class PSIMPL implements PersonaService {

    @Autowired

    private personaRepo repo;
    @Override
    public List<Persona> ConsultarPersona() {
        return (List<Persona>) this.repo.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return this.repo.save(persona);
    }

    @Override
    public Persona buscarPersona(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarPersona(int id) {
this.repo.deleteById(id);;
    }
}
