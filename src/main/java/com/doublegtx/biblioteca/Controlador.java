
package com.doublegtx.biblioteca;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/libros"})
public class Controlador {
    
    @Autowired
    LibroService service;
    
    @GetMapping
    public List<Libro>listar(){
        return service.listar();
    }
    @PostMapping
    public Libro agregar(@RequestBody Libro l) {
        return service.add(l);
    }
    @GetMapping(path = {"/{nombre}"})
    public Libro listarNombre(@PathVariable("nombre")String nombre){
        return service.listarNombre(nombre);
    }
    @PutMapping(path = {"/{nombre}"})
    public Libro editar(@RequestBody Libro l,@PathVariable("nombre")String nombre){
        return service.edit(l, nombre);
    }
    @DeleteMapping(path = {"/{nombre}"})
    public Libro delete(@PathVariable("nombre") String nombre) {
        return service.delete(nombre);
    }
}
