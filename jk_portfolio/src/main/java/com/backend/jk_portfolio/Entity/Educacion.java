package com.backend.jk_portfolio.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Getter;
import lombok.Setter;


@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity 
@Getter @Setter
public class Educacion {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   @NotNull 
   private String institucion;
   @NotNull
   private String titulo;
   @NotNull
    private String fechainicio;
    private String fechafin;
    
    public Educacion() {
   
   }
    
    public Educacion(@NotNull String titulo, @NotNull String institucion, @NotNull String fechainicio,
            String fechafin) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }   
    
}
