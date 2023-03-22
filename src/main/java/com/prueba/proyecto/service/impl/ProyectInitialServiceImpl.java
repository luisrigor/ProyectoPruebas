package com.prueba.proyecto.service.impl;

import com.prueba.proyecto.Entity.Persona;
import com.prueba.proyecto.repository.ProyectInitialRepository;
import com.prueba.proyecto.service.ProyectInitialService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProyectInitialServiceImpl implements ProyectInitialService {

    private final ProyectInitialRepository repository;

    @Override
    public Optional<Persona> pruebasService() {
        return repository.findById(10L);
    }
}
