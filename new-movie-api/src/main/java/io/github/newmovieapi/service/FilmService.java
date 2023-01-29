package io.github.newmovieapi.service;

import io.github.newmovieapi.entity.Film;
import io.github.newmovieapi.entity.StarWarsApiResponse;
import io.github.newmovieapi.feign.StarWarsAPIClient;
import io.github.newmovieapi.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Service
public class FilmService {

    @Autowired
    private StarWarsAPIClient client;


    public List<Film> getLukeSkywalkerFilms() {

        StarWarsApiResponse response = client.getLukeSkywalkerFilms();
        if (response.getStatus() == HttpStatus.OK.value()){
            List<Film> lukeSkywalkerFilms = response.getResult();
            lukeSkywalkerFilms.add(newLukeSkywalkerFilm(lukeSkywalkerFilms.get(0)));
            System.out.println("======== Printing all films =========");
            lukeSkywalkerFilms.forEach(System.out::println);
            return lukeSkywalkerFilms;
        }
        return null;
    }

    private Film newLukeSkywalkerFilm(Film example){
        Film film = new Film();
        film.setCharacters(example.getCharacters());
        film.setDirector("Harry Potter");
        film.setEpisode_id(7);
        film.setRelease_date(DateUtil.returnDateFormatted(Date.valueOf("2023-09-10")));
        film.setTitle("Expecto Patronum");
        return film;
    }
}
