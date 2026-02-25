package com.example.primeraApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludos")
public class Controlador {


    @GetMapping("/hola")
    public String holaxd(){
        return "Holas";
    }

    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holaNombre(@PathVariable String nombre,
                             @PathVariable int edad){
        return "Holas " + nombre + " tu edad es: " + edad;

    }
}
