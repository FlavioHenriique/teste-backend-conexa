package io.github.newmovieapi.feign;

import io.github.newmovieapi.entity.Film;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "http://localhost:8080")
public interface StarWarsAPIClient {

    @RequestMapping(method = RequestMethod.GET, value = "/film/lukeSkywalkerFilms")
    public List<Film> getLukeSkywalkerFilms();
}
