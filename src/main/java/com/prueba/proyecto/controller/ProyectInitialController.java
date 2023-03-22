package com.prueba.proyecto.controller;

import com.prueba.proyecto.Entity.Persona;
import com.prueba.proyecto.service.impl.ProyectInitialServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/v1")
@RequiredArgsConstructor
public class ProyectInitialController {

    private final ProyectInitialServiceImpl serviceImpl;

    @GetMapping("/prueba")
    public ResponseEntity<Optional<Persona>> prueba(){

        return ResponseEntity.ok(serviceImpl.pruebasService());
    }
}
