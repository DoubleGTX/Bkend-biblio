
package com.doublegtx.biblioteca;


import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "Libros")
public class Libro {
  

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private String autor;
    @Column
    private LocalDate fecha_publicacion;
    @Column
    private Integer numero_ejemplares;
    @Column
    private Double costo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(LocalDate fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public Integer getNumero_ejemplares() {
        return numero_ejemplares;
    }

    public void setNumero_ejemplares(Integer numero_ejemplares) {
        this.numero_ejemplares = numero_ejemplares;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
    
}
