package com.prueba.proyecto.controller;

import com.prueba.proyecto.Entity.Persona;
import com.prueba.proyecto.service.impl.ProyectInitialServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/v1")
@RequiredArgsConstructor
@Slf4j
public class ProyectInitialController {

    private final ProyectInitialServiceImpl serviceImpl;

    @GetMapping("/prueba")
    public ResponseEntity<Optional<Persona>> prueba(){
        log.info("Ruby por fin");
        return ResponseEntity.ok(serviceImpl.pruebasService());
    }
}
