package com.vuelafacil.servicios;

import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.repositorios.ICiudadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadService {
    
    @Autowired
    private ICiudadRepository ciudadRepository;
    
    public List<Ciudad> listarCiudades() {
        return ciudadRepository.findAll() ;
    }
}
