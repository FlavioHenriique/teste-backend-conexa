package io.github.newmovieapi.feign;

import io.github.newmovieapi.entity.Film;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StarWarsAPIClientTest {

    @Autowired
    private StarWarsAPIClient client;

    @Test
    public void shouldStarWarsAPIClientReturnValue(){
        List<Film> lukeSkywalkerFilms = client.getLukeSkywalkerFilms();
        Assert.isTrue(lukeSkywalkerFilms.size() > 0, "");
    }
}
