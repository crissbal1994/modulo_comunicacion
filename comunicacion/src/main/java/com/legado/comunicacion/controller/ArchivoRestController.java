/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.legado.comunicacion.controller;

import com.legado.comunicacion.Rep.MensajeRep;
import com.legado.comunicacion.dao.MensajeDAO;
import com.legado.comunicacion.dom.Grupo;
import com.legado.comunicacion.dom.Mensaje;
import com.legado.comunicacion.dom.Usuario;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
	
    private static final Logger logger = Logger.getLogger(RestController.class.getName());
    //Solicitud del usuario y método
    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    public Usuario respuesta(@RequestParam String id_grupo, @RequestParam String id_Usuario) {
    	Usuario u = new Usuario();
    	try {
	        u.setIdUsuario(1);
	        u.setNombreCompleto("Elio Quevedo");
	        Grupo g = new Grupo();
	        g.setIdGrupo(1);
	        Mensaje m=msgRep.findOne((long) 1);
			u.setUK_correo(m.getMensaje());
			u.setIdCarrera(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
//        MensajeDAO md= new MensajeDAO();
//        try {
//        	md.ingresar(u, g, "MensajeP");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
        //La lib json-smart se encarga de convertir automaticamente en json al retornar en un restcontroller
        //Alternativamente pueden armar con gson
        return u;
    }
    
    
}
