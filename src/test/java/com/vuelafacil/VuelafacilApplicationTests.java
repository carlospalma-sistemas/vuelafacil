package com.vuelafacil;

import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.repositorios.ICiudadRepository;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VuelafacilApplicationTests {

    @Autowired
    private ICiudadRepository repoCiudad;
    
    @Test
    @Disabled("Método probado")
    public void verificarSiRepoGuardaCiudad() {
        Ciudad ciudadGuardar = new Ciudad(2, "Medellín", 5001, "Jose María Córdova", "MDE", LocalDate.of(2022, 8, 17), null, true);
        Ciudad c = repoCiudad.save(ciudadGuardar);
        Assertions.assertTrue(c.getId() > 0, "Id de ciudad no es mayor a 0");
    }

}
