package com.examen.sorteo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.examen.sorteo.entity.Sorteo;
import com.examen.sorteo.repository.SorteoRepo;
import com.softsoft.tarjeta.entities.Usuario;

@Controller
public class SorteoController {
	@Autowired
	private SorteoRepo sorteos;
	
	@GetMapping("/sorteos")
	public String sorteos(Model model) {
		model.addAttribute("listaSorteos",sorteos.findAll());
		return "sorteos";
	}
	
	@PostMapping("/sorteo/create")
	public String create(@ModelAttribute(value="sorteo") Sorteo sorteo,RedirectAttributes attributes,Model modelo) {
		sorteos.save(sorteo);
		return "listaSorteos";
	}
	
	
	
}
