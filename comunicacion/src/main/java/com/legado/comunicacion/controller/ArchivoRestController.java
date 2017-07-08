/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.legado.comunicacion.controller;

import com.legado.comunicacion.Rep.MensajeRep;
import java.util.List;
import com.legado.comunicacion.dom.Mensaje;
import com.legado.comunicacion.dom.Resultado;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author 
 */
@RestController
public class ArchivoRestController {
	@Autowired
	private MensajeRep msgRep;
	private Date date;
    private static final Logger logger = Logger.getLogger(RestController.class.getName());
    //Solicitud del usuario y método
    @RequestMapping(value = "/addMessage", method = RequestMethod.GET)
    public Mensaje respuesta(@RequestParam int id_grupo, @RequestParam int id_Usuario, @RequestParam String mensaje ) {
    	date = new Date();
    	Mensaje m = new Mensaje();
    	
    	try {
    		m.setEmisor(id_Usuario);
    		m.setIdGrupo(id_grupo);
    		m.setEnviado(date);
    		m.setMensaje(mensaje);
    		   		
    		msgRep.save(m);
    		 	  		
    		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return m;
    }
    
    
    @RequestMapping(value = "/getMessages", method = RequestMethod.GET)
    public List<Mensaje> respuesta(@RequestParam Long id_grupo ) {
    	date = new Date();
    	
    	List<Mensaje> mensajes = null;
    	
    	try {
    			mensajes = msgRep.encontrarMensajesPorGrupo(id_grupo);
    		 		
    		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return mensajes;
    }
    
    @RequestMapping(value = "/crear_alerta", method = RequestMethod.GET)
    public Resultado respuesta(@RequestParam String modulo, @RequestParam String mensaje, @RequestParam Long usuario, @RequestParam Long grupo  ) {
    	date = new Date();
    	Mensaje m = new Mensaje();
    	Resultado r = new Resultado();
    	try {
    			m.setEmisor(usuario);
    			m.setEnviado(date);
    			m.setIdGrupo(grupo);
    			m.setMensaje(mensaje);
    			
    			msgRep.save(m);
    			
    			
    			r.setEstado(true);
    		 		
    		} catch (Exception e) {
			// TODO Auto-generated catch block
    			r.setEstado(false);
			e.printStackTrace();
		}
        return r;
    }
    
    
    
}
