/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.legado.comunicacion.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author helio
 */
@Controller
public class ArchivoHttpController {
    private static final Logger logger = Logger.getLogger(ArchivoHttpController.class.getName());
    @RequestMapping("/")
    public ModelAndView hello(HttpServletRequest request) {
        logger.log(Level.INFO,request.getServletPath());
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
    
    @RequestMapping("/archivos")
    //RequestParam permite obtener un atributo de la url, debe tener el mismo nombre
    public @ResponseBody ModelAndView redireccion(@RequestParam Long id_grupo, @RequestParam Long id_usuario){
        logger.log(Level.INFO, "Hola " + id_grupo+ " hola", id_grupo);
        ModelAndView mv = new ModelAndView();
        //Esto carga parámetros en el jsp
        mv.addObject("id_grupo", id_grupo);
        mv.addObject("id_usuario", id_usuario);
        //Esto carga el jsp correspondiente como la vista ante la solicitud del usuario
        mv.setViewName("archivos");
	return mv;
    }
}
