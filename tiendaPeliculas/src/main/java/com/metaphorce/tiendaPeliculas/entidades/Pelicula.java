package com.metaphorce.tiendaPeliculas.entidades;

public class Pelicula {
    // ATRIBUTOS
    private Integer id;
    private String nombre;
    private boolean disponible;

    // CONSTRUCTORES
    public Pelicula() {
    }
    public Pelicula(Integer id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }
    
    // GET-SET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
