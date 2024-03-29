package com.backend.jk_portfolio.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotBlank
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotBlank
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotBlank
    @Size(min = 30, max = 1000, message = "Longitud inadecuada.")
    private String acerca;
    
    private String titulo;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;
   

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Experiencia> experienciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Skills> skillsList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Proyecto> proyectoList;

    public Persona() {
    }

    public Persona(@NotBlank String nombre, @NotBlank String apellido, String img, @NotBlank String acerca,
            @NotBlank String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.acerca = acerca;
        this.titulo = titulo;
} 

}
