package io.github.starwarsapi.controller;

import io.github.starwarsapi.entity.CustomizedResponse;
import io.github.starwarsapi.exception.FilmNotFoundException;
import io.github.starwarsapi.service.FilmService;
import io.github.starwarsapi.service.PeopleService;
import io.github.starwarsapi.entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private FilmService filmService;

    @GetMapping("/lukeSkywalkerFilms")
    public ResponseEntity<CustomizedResponse> getLukeSkywalkerfilms(){
        List<Film> filmList = peopleService.getLukeSkywalkerFilms();

        return ResponseEntity.ok(new CustomizedResponse(
                HttpStatus.OK.value(),
                "List of films",
                filmList));
    }

    @GetMapping("/getByTitle")
    public ResponseEntity<CustomizedResponse> getByTitle(@RequestParam String title){
        Film film = null;
        try {
            film = filmService.getByTitle(title);
        } catch (FilmNotFoundException e) {
            return buildBadRequestResponse(e.getMessage());
        }
        return buildOkResponse("Film by title", film);
    }

    @GetMapping("/getByEpisodeId")
    public ResponseEntity<CustomizedResponse> getByEpisodeId(@RequestParam int id){
        Film film = null;
        try {
            film = filmService.getByEpisodeID(id);
        } catch (FilmNotFoundException e) {
            return buildBadRequestResponse(e.getMessage());
        }

        return buildOkResponse("Film by id", film);
    }

    private ResponseEntity<CustomizedResponse> buildOkResponse(String msg, Object result){
        return ResponseEntity.ok(new CustomizedResponse(
                HttpStatus.OK.value(),
                msg,
                result));
    }

    private ResponseEntity<CustomizedResponse> buildBadRequestResponse(String msg){
        return ResponseEntity.badRequest()
                .body(new CustomizedResponse(
                        HttpStatus.BAD_REQUEST.value(),
                        msg,
                        null));
    }
}
