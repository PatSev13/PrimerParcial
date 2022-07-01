package com.primerparcial.primerparcial.service;

import com.primerparcial.primerparcial.entity.Artistas;
import com.primerparcial.primerparcial.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistasService implements IArtistaService{
    
    @Autowired
    private ArtistaRepository artistaRepository;
    
    @Override
    public List<Artistas> listArtist() {
        return (List<Artistas>) artistaRepository.findAll();
    }
}
