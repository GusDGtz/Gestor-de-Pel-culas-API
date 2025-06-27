package com.metaphorce.tiendaPeliculas.controllers;


import com.metaphorce.tiendaPeliculas.entidades.Pelicula;
import com.metaphorce.tiendaPeliculas.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/gestorPeliculas/peliculas")
public class PeliculaController {


    @Autowired
    private PeliculaService service;

    // CREATE  → POST
    @PostMapping
    public ResponseEntity<Pelicula> guardarPelicula(@RequestBody Pelicula pelicula) {
        Pelicula creado = service.setPelicula(pelicula);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    // READ ALL → GET
    @GetMapping
    public ResponseEntity<List<Pelicula>> obtenerPelicula() {
        List<Pelicula> lista = service.getPelicula();
        return ResponseEntity.ok(lista);
    }

    // READ ONE → GET
    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> obtenerClientePorId(
            @PathVariable Integer id) {
        return service.getPelicula()
                .stream()
                .filter(c -> c.getId_pelicula().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE → PUT
    @PutMapping("/{id}")
    public ResponseEntity<Pelicula> updatePelicula(
            @PathVariable Integer id,
            @RequestBody Pelicula pelicula) {
        pelicula.setId_pelicula(id);
        Pelicula actualizado = service.updatePelicula(pelicula);
        return ResponseEntity.ok(actualizado);
    }

    // DELETE → DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPelicula(
            @PathVariable Integer id) {
        service.deletePelicula(id);
        return ResponseEntity.noContent().build();
    }
}
