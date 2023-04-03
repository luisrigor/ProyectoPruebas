package com.prueba.proyecto.controller;

import com.prueba.proyecto.Entity.Persona;
import com.prueba.proyecto.service.impl.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("CRUPRepo")
public class Controlador {

    @Autowired
    private PSIMPL impl;

    @GetMapping
    @RequestMapping(value = "consultarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> consultarPersonas() {
        List<Persona> listaPersona = this.impl.consultarPersona();
        return ResponseEntity.ok(listaPersona);

    }

    @PostMapping
    @RequestMapping(value = "CrearPersonas", method = RequestMethod.POST)
    public ResponseEntity<Persona> CrearPersonas(@RequestBody Persona persona) {
        Persona personaCreada = this.impl.crearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaCreada);

    }

    @PutMapping
    @RequestMapping(value = "modificarPersonas", method = RequestMethod.PUT)
    public ResponseEntity<Persona> modificarPersonas(@RequestBody Persona Persona) {
        Persona personaModificada = this.impl.modificarPersona(Persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaModificada);
    }

    @GetMapping(value = "buscarPersona/{id}")
    public ResponseEntity<Optional<Persona>> buscarPersona (@PathVariable int id){
        Optional<Persona> persona = this.impl.buscarPersona(id);
        return ResponseEntity.ok(persona);
    }
    @DeleteMapping
    @RequestMapping(value = "eliminarPersonas/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Persona> eliminarPersonas ( @PathVariable int id){
        this.impl.eliminarPersona(id);
        return ResponseEntity.ok().build();
    }

}