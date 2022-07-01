package com.primerparcial.primerparcial.repository;

import com.primerparcial.primerparcial.entity.Eventos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventosRepository extends CrudRepository<Eventos, Long>{
    
}
