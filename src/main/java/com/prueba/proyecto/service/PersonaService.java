package com.prueba.proyecto.service;

import com.prueba.proyecto.Entity.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaService {
     List<Persona>  ConsultarPersona();
    Persona  crearPersona(Persona persona);
    public Persona        modificarPersona(Persona persona);
    Optional<Persona> buscarPersona(int id);
    public void        eliminarPersona(int id);


}
