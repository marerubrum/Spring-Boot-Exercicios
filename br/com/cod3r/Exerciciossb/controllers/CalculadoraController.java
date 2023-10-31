package br.com.cod3r.Exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

	@GetMapping(path="somar/{a}/{b}")
	private int somar(
			@PathVariable(name="a") int a, 
			@PathVariable(name="b") int b) {
		int resultado = a + b;
		return resultado;
	}
	
	@GetMapping(path="subtrair")
	private int subtrair(
			@RequestParam(name="a") int a, 
			@RequestParam(name="b") int b) {
		int resultado = a - b;
		return resultado;
	}
}
