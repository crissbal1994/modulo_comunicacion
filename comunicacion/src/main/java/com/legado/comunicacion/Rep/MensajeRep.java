package com.legado.comunicacion.Rep;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.legado.comunicacion.dom.Mensaje;

@Repository
public interface MensajeRep extends CrudRepository<Mensaje, Long>{
	
	@Query("SELECT m FROM Mensaje m WHERE id_grupo= :id")
	List<Mensaje> encontrarMensajesPorGrupo (@Param("id")Long id);
}
