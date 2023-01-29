package io.github.newmovieapi.feign;

import io.github.newmovieapi.entity.StarWarsApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "jplaceholder", url = "host-star-wars-api:8082")
public interface StarWarsAPIClient {

    @RequestMapping(method = RequestMethod.GET, value = "/film/lukeSkywalkerFilms")
    public StarWarsApiResponse getLukeSkywalkerFilms();
}
