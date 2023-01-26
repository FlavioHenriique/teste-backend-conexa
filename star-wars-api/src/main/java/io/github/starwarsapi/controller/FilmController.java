package io.github.starwarsapi.controller;

import io.github.starwarsapi.PeopleService;
import io.github.starwarsapi.entity.Film;
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
    private PeopleService peopleService;

    @GetMapping("/lukeSkywalkerFilms")
    public ResponseEntity<List<Film>> getLukeSkywalkerfilms(){
        List<Film> filmList = peopleService.getLukeSkywalkerFilms();

        return ResponseEntity.ok(filmList);
    }
}
