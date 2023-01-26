package io.github.newmovieapi.controller;

import io.github.newmovieapi.entity.Film;
import io.github.newmovieapi.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService service;

    @GetMapping
    public ResponseEntity<List<Film>> getFilms(){
        List<Film> films = service.getLukeSkywalkerFilms();
        return ResponseEntity.ok(films);
    }
}