
package com.backend.jk_portfolio.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity 
@Getter @Setter
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombreSkill;
    @NotNull
    @Range(min = 0, max = 100, message = "Por favor, ingrese valores positivos entre 0 y 100.")
    private int porcentaje;
    
    public Skills() {
    }

    public Skills(@NotNull String nombreSkill, @Range(min = 1, max = 100) int porcentaje) {
        this.nombreSkill = nombreSkill;
        this.porcentaje = porcentaje;
       
    }
    
}
