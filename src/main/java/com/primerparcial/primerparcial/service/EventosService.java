package com.primerparcial.primerparcial.service;

import com.primerparcial.primerparcial.entity.Eventos;
import com.primerparcial.primerparcial.repository.EventosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventosService implements IEventosService{
    
    @Autowired
    private EventosRepository eventosRepository;
    
    @Override
    public List<Eventos> getAllEventos() {
        return(List<Eventos>) eventosRepository.findAll();
    }

    @Override
    public Eventos getEventoById(long id) {
        return eventosRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEvento(Eventos evento) {
        eventosRepository.save(evento);
    }

    @Override
    public void delete(long id) {
        eventosRepository.deleteById(id);
    }
}
