package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Evento;
import com.example.demo.repositories.EventoRepository;

@Service
public class EventoService {

    @Autowired 
    private EventoRepository repository;

    public List<Evento> getEventos() {
        return repository.findAll();
    }

    public void saveEvento(Evento evento) {
        repository.save(evento);
    }
    
}
