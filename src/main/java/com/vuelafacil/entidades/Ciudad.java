package com.vuelafacil.entidades;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tciudades")
public class Ciudad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 45, nullable = false, unique = true)
    private String nombre;
    
    @Column(nullable = false, unique = true)
    private Integer codigo_dane;
    
    @Column(length = 45, nullable = false, unique = true)
    private String nombre_aeropuerto;
    
    @Column(length = 45, nullable = false, unique = true)
    private String sigla_aeropuerto;
    
    @Column(nullable = false)
    private LocalDate fecha_inicio_operacion;
    
    @Column(nullable = true)
    private LocalDate fecha_fin_operacion;
    
    @Column(columnDefinition = "TINYINT", length = 1)
    private boolean hab;

    public Ciudad() {
    }
    
    public Ciudad(Integer id, String nombre, Integer codigo_dane, String nombre_aeropuerto, String sigla_aeropuerto, LocalDate fecha_inicio_operacion, LocalDate fecha_fin_operacion, boolean hab) {
        this.id = id;
        this.nombre = nombre;
        this.codigo_dane = codigo_dane;
        this.nombre_aeropuerto = nombre_aeropuerto;
        this.sigla_aeropuerto = sigla_aeropuerto;
        this.fecha_inicio_operacion = fecha_inicio_operacion;
        this.fecha_fin_operacion = fecha_fin_operacion;
        this.hab = hab;
    }
    
    public Ciudad(String nombre, Integer codigo_dane, String nombre_aeropuerto, String sigla_aeropuerto, LocalDate fecha_inicio_operacion, LocalDate fecha_fin_operacion, boolean hab) {
        this.id = 0;
        this.nombre = nombre;
        this.codigo_dane = codigo_dane;
        this.nombre_aeropuerto = nombre_aeropuerto;
        this.sigla_aeropuerto = sigla_aeropuerto;
        this.fecha_inicio_operacion = fecha_inicio_operacion;
        this.fecha_fin_operacion = fecha_fin_operacion;
        this.hab = hab;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo_dane() {
        return codigo_dane;
    }

    public void setCodigo_dane(Integer codigo_dane) {
        this.codigo_dane = codigo_dane;
    }

    public String getNombre_aeropuerto() {
        return nombre_aeropuerto;
    }

    public void setNombre_aeropuerto(String nombre_aeropuerto) {
        this.nombre_aeropuerto = nombre_aeropuerto;
    }

    public String getSigla_aeropuerto() {
        return sigla_aeropuerto;
    }

    public void setSigla_aeropuerto(String sigla_aeropuerto) {
        this.sigla_aeropuerto = sigla_aeropuerto;
    }

    public LocalDate getFecha_inicio_operacion() {
        return fecha_inicio_operacion;
    }

    public void setFecha_inicio_operacion(LocalDate fecha_inicio_operacion) {
        this.fecha_inicio_operacion = fecha_inicio_operacion;
    }

    public LocalDate getFecha_fin_operacion() {
        return fecha_fin_operacion;
    }

    public void setFecha_fin_operacion(LocalDate fecha_fin_operacion) {
        this.fecha_fin_operacion = fecha_fin_operacion;
    }

    public boolean isHab() {
        return hab;
    }

    public void setHab(boolean hab) {
        this.hab = hab;
    }
    
    
     
}
