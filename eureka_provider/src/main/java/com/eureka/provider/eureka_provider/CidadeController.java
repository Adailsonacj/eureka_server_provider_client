package com.eureka.provider.eureka_provider;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class CidadeController {
	@GetMapping
	@RequestMapping("/cidades")
	public String listar() {
//		List cidades = (List) new ArrayList<>();
//		cidades.add("Palmas");
//		cidades.add("Goiani");
		return "Cidade";
	}
}
