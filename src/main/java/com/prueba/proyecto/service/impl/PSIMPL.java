package com.prueba.proyecto.service.impl;

import com.prueba.proyecto.Entity.Persona;
import com.prueba.proyecto.repository.personaRepo;
import com.prueba.proyecto.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PSIMPL implements PersonaService {
  //camel case
    private final personaRepo repo;
    @Override
    public List<Persona> consultarPersona() {

        return repo.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        persona.setEmail(persona.getEmail());
        return repo.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return repo.save(persona);
    }

    @Override
    public Optional<Persona> buscarPersona(int id) {
        return repo.findById(id);
    }

    @Override
    public void eliminarPersona(int id) {
        this.repo.deleteById(id);
    }
}
