
package com.doublegtx.biblioteca;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImp implements LibroService{
    @Autowired
    private LibroRepositorio repositorio;
    
    @Override
    public List<Libro> listar(){
        return repositorio.findAll();
    }

    @Override
    public Libro listarNombre(String nombre) {
        return repositorio.findById(nombre);
    }
    
    @Override
    public Libro add(Libro l) {
        return repositorio.save(l);
    }

    @Override
    public Libro edit(Libro l, String nombre) {
        this.delete(nombre);
        return repositorio.save(l);
    }

   @Override
    public Libro delete(String nombre) {
        Libro l=repositorio.findById(nombre);
        if(l!=null) {
            repositorio.delete(l);
        }
        return l;
    }

    
}
