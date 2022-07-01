package com.primerparcial.primerparcial.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name="eventos")

public class Eventos implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private long id;
    private int costo;
    private String fecha;
    private int capacidad_max;
    private String lugar;
    
    @ManyToOne
    @JoinColumn(name="artistas_id")
    private Artistas artista;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Artistas getArtista() {
        return artista;
    }

    public void setArtista(Artistas artista) {
        this.artista = artista;
    }
    
    
    
}
