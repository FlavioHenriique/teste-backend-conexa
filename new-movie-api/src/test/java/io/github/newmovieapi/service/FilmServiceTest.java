package io.github.newmovieapi.service;

import io.github.newmovieapi.entity.Film;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilmServiceTest {

    @Autowired
    private FilmService service;

    @Test
    public void shouldGetLukeSkywalkerFilmsReturnValues(){
        List<Film> lukeSkywalkerFilms = service.getLukeSkywalkerFilms();

        Assert.assertNotNull(lukeSkywalkerFilms);
        Assert.assertEquals(lukeSkywalkerFilms.size(), 5);
    }
}