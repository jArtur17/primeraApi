package com.example.primeraApi.controlador;

import com.example.primeraApi.entidad.Estudiante;
import org.springframework.ui.Model; //importante
import com.example.primeraApi.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormularioRegistro(Model model){
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        return "crear_estudiante";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        servicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormulariodeEditar(@PathVariable Long id, Model model){
        model.addAttribute("estudiante", servicio.obtenerEstudiantexId(id));
        return "editar_estudiante";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante, Model modelo){
        Estudiante estudianteExistente = servicio.obtenerEstudiantexId(id);
        estudianteExistente.setId(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setEmail(estudiante.getEmail());
        servicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable Long id){
        servicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }



}
