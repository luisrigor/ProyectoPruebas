package com.prueba.proyecto.repository;

import com.prueba.proyecto.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personaRepo extends JpaRepository<Persona,Integer> {
}
