package com.hamdi.hamdi;

import com.hamdi.hamdi.Services.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HamdiApplication implements CommandLineRunner {
	@Autowired
	private ICinemaService iCinemaService;


	public static void main(String[] args) {
		SpringApplication.run(HamdiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iCinemaService.initVilles();
		iCinemaService.initCinemas();
		iCinemaService.initSalles();
		iCinemaService.initPlaces();
		iCinemaService.initSeancess();
		iCinemaService.initFilms();
		iCinemaService.initCategorie();
		iCinemaService.initProjections();

	}
}
