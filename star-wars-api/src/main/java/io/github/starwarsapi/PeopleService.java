package io.github.starwarsapi;

import io.github.starwarsapi.entity.Film;
import io.github.starwarsapi.entity.People;
import io.github.starwarsapi.entity.SwapiResult;
import io.github.starwarsapi.feign.SwapiClient;
import io.github.starwarsapi.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeopleService {

    @Autowired
    private SwapiClient swapiClient;

    public List<Film> getLukeSkywalkerFilms() {

        // Reading people list and filtering a People with "Luke Skywalker" name
        People lukeSkywalker = swapiClient.getPeople().getResults()
                .stream()
                .filter(i -> "Luke Skywalker".equals(i.getName())).collect(Collectors.toList()).get(0);

        // Getting all the films
        SwapiResult<Film> films = swapiClient.getFilms();

        // Filtering the list of films that contain Luke Skywalker character in the list of characters
        List<Film> filmList = films.getResults()
                .stream()
                .filter(f -> f.getCharacters().contains(lukeSkywalker.getUrl()))
                .collect(Collectors.toList());

        filmList.forEach(f -> {
            f.setRelease_date(DateUtil.returnDateFormatted(Date.valueOf(f.getRelease_date())));
        });
        return filmList;
    }
}
