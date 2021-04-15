package com.doublegtx.biblioteca;

import java.util.List;

/**
 *
 * @author GRX
 */
public interface LibroService {
    List<Libro>listar();
    Libro listarNombre(String nombre);
    Libro add(Libro l);
    Libro edit(Libro l, String nombre);
    Libro delete(String nombre);
}
