package com.vuelafacil.repositorios;

import com.vuelafacil.entidades.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadRepository extends JpaRepository<Ciudad, Integer>{
    
}
