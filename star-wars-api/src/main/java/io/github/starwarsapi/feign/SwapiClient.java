package io.github.starwarsapi.feign;

import io.github.starwarsapi.entity.Film;
import io.github.starwarsapi.entity.People;
import io.github.starwarsapi.entity.SwapiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "jplaceholder", url = "https://swapi.dev/api")
public interface SwapiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/people")
    public SwapiResult<People> getPeople();


    @RequestMapping(method = RequestMethod.GET, value = "/films")
    public SwapiResult<Film> getFilms();
}
