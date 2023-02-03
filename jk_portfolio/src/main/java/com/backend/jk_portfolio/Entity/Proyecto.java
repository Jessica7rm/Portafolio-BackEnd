
package com.backend.jk_portfolio.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity 
@Getter @Setter
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombreProyecto;
    @NotNull
    @Size(max = 1000, message = "Longitud inadecuada.")
    private String descripcionProyecto;
    private String imgProyecto;
    private String linkProyecto;
    @NotNull
    private String fechaProyecto;
    
    public Proyecto() {
    }

    public Proyecto(@NotNull String nombreProyecto, @NotNull String descripcionProyecto, String imgproyecto,
            String linkproyecto, @NotNull String fechaProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.imgProyecto = imgproyecto;
        this.linkProyecto = linkproyecto;
        this.fechaProyecto = fechaProyecto;
        
    }

}
