package com.uem.restbasico.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.uem.restbasico.modelo.entidad.Videojuego;

@RestController
public class Controlador {

	private Videojuego mario;

	@GetMapping("videojuego")
	public Videojuego obtenerVideojuegoGet() {
		mario = new Videojuego(1, "Mario", "Nintendo", 60);
		return mario;
	}

	@PutMapping("videojuego")
	public Videojuego obtenerVideojuegoPut() {
		mario = new Videojuego(1, "Mario", "Nintendo", 60);
		mario.setPrecio(mario.getPrecio() + 40);
		return mario;
	}
}