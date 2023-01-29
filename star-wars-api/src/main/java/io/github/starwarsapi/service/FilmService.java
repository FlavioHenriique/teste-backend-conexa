package io.github.starwarsapi.service;

import io.github.starwarsapi.entity.Film;
import io.github.starwarsapi.entity.SwapiResult;
import io.github.starwarsapi.exception.FilmNotFoundException;
import io.github.starwarsapi.feign.SwapiClient;
import io.github.starwarsapi.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class FilmService {

    @Autowired
    private SwapiClient swapiClient;

    public Film getByTitle(String title) throws FilmNotFoundException {
        SwapiResult<Film> films = swapiClient.getFilms();
        for (int i = 0; i < films.getResults().size(); i ++){
            Film film = films.getResults().get(i);
            if (title.equals(film.getTitle())){
                convertDate(film);
                return film;
            }
        }
        throw new FilmNotFoundException("Film not found");
    }

    public Film getByEpisodeID(int id) throws FilmNotFoundException {
        SwapiResult<Film> films = swapiClient.getFilms();
        for (int i = 0; i < films.getResults().size(); i ++){
            Film film = films.getResults().get(i);
            if (id == film.getEpisode_id()){
                convertDate(film);
                return film;
            }
        }
        throw new FilmNotFoundException("Film not found");
    }

    private void convertDate(Film film){
        Date date = Date.valueOf(film.getRelease_date());
        film.setRelease_date(DateUtil.returnDateFormatted(date));
    }
}
