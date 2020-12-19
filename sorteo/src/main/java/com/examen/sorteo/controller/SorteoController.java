package com.examen.sorteo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.examen.sorteo.entity.Sorteo;
import com.examen.sorteo.repository.SorteoRepo;


@Controller
public class SorteoController {
	@Autowired
	private SorteoRepo sorteos;
	
	@GetMapping("/sorteos")
	public String sorteos(Model model) {
		model.addAttribute("listaSorteos",sorteos.findAll());
		return "listaSorteos";
	}
	
	@PostMapping("/sorteo/create")
	public String create(@Validated Sorteo sorteo,Model modelo) {
		sorteos.save(sorteo); 
		return "redirect:/sorteos";
	}
	
	@GetMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Integer id, Model model) {
		sorteos.deleteById(id);
		return "redirect:/sorteos";
	}
	
	
	
	
}
