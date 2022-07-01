package com.primerparcial.primerparcial.repository;

import com.primerparcial.primerparcial.entity.Artistas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends CrudRepository<Artistas, Long>{
    
}
