package com.metaphorce.tiendaPeliculas.entidades;


import jakarta.persistence.*;

@Entity
@Table(name = "Peliculas")
public class Pelicula {
    // ATRIBUTOS
    @Id // Definimos lo siguiente como id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Obtenemos la generación automática del id de MySQL
    private Integer id_pelicula;
    private String nombre_pelicula;
    private boolean disponible = true;

    // CONSTRUCTORES
    public Pelicula() {
    }
    public Pelicula(Integer id_pelicula, String nombre_pelicula, boolean disponible) {
        this.id_pelicula = id_pelicula;
        this.nombre_pelicula = nombre_pelicula;
        this.disponible = disponible;
    }

    // GET-SET
    public Integer getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Integer id) {
        this.id_pelicula = id;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre) {
        this.nombre_pelicula = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
