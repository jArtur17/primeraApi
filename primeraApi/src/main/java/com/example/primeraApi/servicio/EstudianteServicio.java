package com.example.primeraApi.servicio;

import com.example.primeraApi.entidad.Estudiante;

import java.util.List;

public interface EstudianteServicio {

    public List<Estudiante> listar_Allstudents();

    public Estudiante guardarEstudiante(Estudiante estudiante);


}
