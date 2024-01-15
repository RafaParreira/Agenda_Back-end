package com.example.demo.controllers;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Evento;
import com.example.demo.repositories.EventoRepository;
import com.example.demo.services.EventoService;

@RestController
@RequestMapping("/evento")
public class EventoController {

	@Autowired
	private EventoService service;
	
	@GetMapping
	public List<Evento> listarEvento(){
		return service.getEventos();
	}
	@PostMapping 
	public void cadastrarEvento(@RequestBody Evento evento) {
		service.saveEvento(evento);
	}
	
}