package com.folcademy.primeraapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoController {
    @GetMapping("/hello")
    public String hello(){
        return "Hola! Mi nombre es Patricio Frettes y esta es mi primera API";
    }
    @PostMapping("/goodbye")
    public String goodbye(){
        return "Hasta luego!";
    }
}
