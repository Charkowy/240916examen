package com.charko.examen.controller;

import java.util.ArrayList;
import com.charko.examen.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class Controlador {

	Generator generador = new Generator(); 
	@GetMapping("/lista")
	@ResponseBody
	public String checklist(@RequestParam Integer identificador) {
	ArrayList<Integer> lista = generador.generador();
	Boolean checknum = false;
	if (lista.contains(identificador)) {
		checknum = true;
	}
	if (checknum == true) {
	    return "El numero ingresado: " + identificador + " se encuentra en la lista: "  + lista;
	}else {
		return "El numero ingresado: " + identificador + " no se encuentra en la lista: " + lista;
	}
	}
	
	
}
