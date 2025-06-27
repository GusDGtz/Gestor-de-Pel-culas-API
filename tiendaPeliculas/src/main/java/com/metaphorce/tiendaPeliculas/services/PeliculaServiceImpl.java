package com.metaphorce.tiendaPeliculas.services;

import com.metaphorce.tiendaPeliculas.entidades.Pelicula;
import com.metaphorce.tiendaPeliculas.repositories.PeliculaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    PeliculaRepository repository;

    // CREATE
    @Override
    public Pelicula setPelicula(Pelicula pelicula) {
        return repository.save(pelicula);
    }
    // READ
    @Override
    public List<Pelicula> getPelicula() {
        return repository.findAll();
    }
    // UPDATE
    @Override
    public Pelicula updatePelicula(Pelicula pelicula) {
        return repository.save(pelicula);
    }
    // DELETE
    @Override
    public void deletePelicula(Integer id_pelicula) {
        if (!repository.existsById(id_pelicula)) {
            throw new EntityNotFoundException("No hay cliente con id " + id_pelicula);
        }
        repository.deleteById(id_pelicula);
    }
}
