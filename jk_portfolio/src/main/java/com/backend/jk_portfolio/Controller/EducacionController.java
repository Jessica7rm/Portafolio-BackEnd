
package com.backend.jk_portfolio.Controller;


import com.backend.jk_portfolio.Entity.Educacion;
import com.backend.jk_portfolio.Interface.IEducacionService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;







@CrossOrigin(origins = "https://portafolio-jessica7rm.web.app/#")
@RequestMapping("educacion")
@RestController
public class EducacionController {
    
    @Autowired 
    public IEducacionService iEducacionService; 
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list() {
        List<Educacion> listaExpe = iEducacionService.getEducacion();
        return new ResponseEntity<>(listaExpe, HttpStatus.OK);
    }
    
    @GetMapping("/traer/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        Educacion educacion = iEducacionService.findEducacion(id);
        if (educacion == null) {
            return new ResponseEntity<>("Educacion no encontrada", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {

        if (iEducacionService.findEducacion(id) == null) {
            return new ResponseEntity<>("Educacion no encontrada", HttpStatus.BAD_REQUEST);
        }
        iEducacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<?> addEducacion(@RequestBody Educacion educacion) {
        if (StringUtils.isBlank(educacion.getTitulo())
                && StringUtils.isBlank(educacion.getInstitucion())
                && StringUtils.isBlank(educacion.getFechainicio())) {
            return new ResponseEntity<>("Hay campos obligatorios sin completar.", HttpStatus.BAD_REQUEST);

        }
        iEducacionService.saveEducacion(educacion);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarEducacion(@PathVariable int id, @RequestBody Educacion educacion) {

        Educacion educacionEditada = iEducacionService.findEducacion(id);

        if (educacionEditada == null) {
            return new ResponseEntity<>("Educación no encontrada.", HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(educacion.getTitulo())
                && StringUtils.isBlank(educacion.getInstitucion())
                && StringUtils.isBlank(educacion.getFechainicio())) {
            return new ResponseEntity<>("Hay campos obligatorios sin completar.", HttpStatus.BAD_REQUEST);
        }

        educacionEditada.setTitulo(educacion.getTitulo());
        educacionEditada.setInstitucion(educacion.getInstitucion());
        educacionEditada.setFechainicio(educacion.getFechainicio());
        educacionEditada.setFechafin(educacion.getFechafin());

        iEducacionService.saveEducacion(educacionEditada);
        return new ResponseEntity<>(educacionEditada, HttpStatus.OK);
    }
    
}
