package com.vuelafacil.controladores;

import com.vuelafacil.servicios.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @Autowired
    CiudadService ciudadServicio;
    
    @GetMapping("/")
    public String cargarIndex(){
        return "index";
    }
    
    @GetMapping("/ciudades/new")
    public String cargarFormCiudades(){
        return "formciudades";
    }
    
    @GetMapping("/ciudades")
    public String cargarListaCiudades(Model model){
        model.addAttribute("ciudades", ciudadServicio.listarCiudades());
        return "listaciudades";
    }
    
}
