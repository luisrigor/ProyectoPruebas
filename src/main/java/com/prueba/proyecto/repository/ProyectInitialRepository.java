package com.prueba.proyecto.repository;

import com.prueba.proyecto.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProyectInitialRepository extends JpaRepository<Persona,Long> {
     Optional<Persona> findById(Long id);
     List<Persona> findAll();
}
