package com.prueba.proyecto.repository;

import com.prueba.proyecto.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface personaRepo extends CrudRepository<Persona,Integer> {
}
