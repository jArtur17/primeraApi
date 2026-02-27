package com.example.primeraApi.controlador;

import com.example.primeraApi.entidad.Estudiante;
import org.springframework.ui.Model; //importante
import com.example.primeraApi.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio servicio;

    @GetMapping({"/estudiantes", "/"})
    public String listarEstudiantes(Model model){
        model.addAttribute("estudiantes", servicio.listar_Allstudents());
        return "estudiantes"; //nos retorna el archivo estudiantes
    }

}
