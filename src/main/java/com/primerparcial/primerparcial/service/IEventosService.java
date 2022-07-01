package com.primerparcial.primerparcial.service;

import com.primerparcial.primerparcial.entity.Eventos;
import java.util.List;

public interface IEventosService {
    public List<Eventos> getAllEventos();
    public Eventos getEventoById (long id);
    public void saveEvento(Eventos evento);
    public void delete(long id);
    
}
