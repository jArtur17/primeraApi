package com.example.primeraApi.servicio;

import com.example.primeraApi.entidad.Estudiante;
import com.example.primeraApi.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicioIMP implements EstudianteServicio{

    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public List<Estudiante> listar_Allstudents() {
        return repositorio.findAll();
    }
}
