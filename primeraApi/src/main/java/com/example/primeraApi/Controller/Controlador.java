package com.example.primeraApi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @GetMapping("/detalles_info")

    public String Info(Model model) {
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "Artur");
        model.addAttribute("Ip", "123");
        return "detalles_info";
    }
}
