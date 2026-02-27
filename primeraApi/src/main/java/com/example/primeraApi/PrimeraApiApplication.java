package com.example.primeraApi;

import com.example.primeraApi.entidad.Estudiante;
import com.example.primeraApi.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeraApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PrimeraApiApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run (String...args) throws Exception{
		/*
		Estudiante estudiante1 = new Estudiante("Michi", "Leandro", "michi123@hmail.com");
		repositorio.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("Arturo", "Bañol", "arturo123@hmail.com");
		repositorio.save(estudiante2);*/
	}

}
