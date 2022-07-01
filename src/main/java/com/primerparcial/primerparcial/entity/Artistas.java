package com.primerparcial.primerparcial.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="artistas")

public class Artistas implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private long id;
    private String nombre_artista;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_artista() {
        return nombre_artista;
    }

    public void setNombre_artista(String nombre_artista) {
        this.nombre_artista = nombre_artista;
    }
    
    
    
}
