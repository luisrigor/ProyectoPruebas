package com.prueba.proyecto.service;

import com.prueba.proyecto.Entity.Persona;
import java.util.List;
public interface PersonaService {

    public List<Persona>    ConsultarPersona();
    public Persona        crearPersona(Persona persona);
    public Persona        modificarPersona(Persona persona);
    public Persona        buscarPersona(int id);
    public void        eliminarPersona(int id);


}
