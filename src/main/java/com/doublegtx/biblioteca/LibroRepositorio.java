
package com.doublegtx.biblioteca;


import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author GRX
 */
public interface LibroRepositorio extends Repository<Libro, String> {
    List<Libro>findAll();
    Libro findById(String nombre);
    Libro save(Libro l);
    void delete(Libro l);
}
