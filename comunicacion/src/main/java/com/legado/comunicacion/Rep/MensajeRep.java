package com.legado.comunicacion.Rep;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.legado.comunicacion.dom.Mensaje;

public interface MensajeRep extends CrudRepository<Mensaje, Long>{
	
}
