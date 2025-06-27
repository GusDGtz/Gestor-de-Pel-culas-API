package com.metaphorce.tiendaPeliculas.services;

import com.metaphorce.tiendaPeliculas.entidades.Pelicula;

import java.util.List;

public interface PeliculaService {
    // CREATE
    Pelicula setPelicula(Pelicula pelicula);
    //READ
    List<Pelicula> getPelicula();

    //UPDATE
    Pelicula updatePelicula(Pelicula pelicula);

    //DELETE
    void deletePelicula(Integer id_pelicula);
}
