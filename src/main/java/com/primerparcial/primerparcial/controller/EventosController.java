package com.primerparcial.primerparcial.controller;

import com.primerparcial.primerparcial.entity.Artistas;
import com.primerparcial.primerparcial.entity.Eventos;
import com.primerparcial.primerparcial.service.IArtistaService;
import com.primerparcial.primerparcial.service.IEventosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventosController {
    
    @Autowired
    private IArtistaService artistaService;
    
    @Autowired
    private IEventosService eventosService;
    
    
    @GetMapping("/historial")
    public String mostrarEventos (Model model){
        List<Eventos> listaEventos = eventosService.getAllEventos();
        model.addAttribute("titulo", "Tabla de Eventos");
        model.addAttribute("eventos", listaEventos);
        
        return "historial";
        
    }
    
    @GetMapping("/historialN")
    public String crearEvento (Model model){
        List<Artistas> listaArtistas = artistaService.listArtist();
        model.addAttribute("evento", new Eventos());
        model.addAttribute("artista", listaArtistas);
        
        return "crear";
        
    }
    
    @PostMapping("/save")
    public String guardarEvento (@ModelAttribute Eventos evento){
        eventosService.saveEvento(evento);
        
        return "redirect:/historial";
        
    }
    
    @GetMapping("/delete/{id}")
    public String elimnarEvento (@PathVariable("id") Long idEvento){
        eventosService.delete(idEvento);
        return "redirect:/historial";
    }
    
}
