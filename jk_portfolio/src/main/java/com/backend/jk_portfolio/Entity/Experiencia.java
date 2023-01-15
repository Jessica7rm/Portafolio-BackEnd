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
@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull 
    private String nombreExpe;
    @NotNull
    private String empresaExpe;
    @NotNull 
    private String descripcionExpe;
    @NotNull
    private String fechainicio;
    private String fechafin;

    public Experiencia() {
    
}
    
 public Experiencia(@NotNull String nombreExpe,@NotNull String empresaExpe , @NotNull String descripcionExpe, @NotNull String fechainicio,
            String fechafin) {
     
        this.nombreExpe = nombreExpe;
        this.empresaExpe = empresaExpe;
        this.descripcionExpe = descripcionExpe;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

}
