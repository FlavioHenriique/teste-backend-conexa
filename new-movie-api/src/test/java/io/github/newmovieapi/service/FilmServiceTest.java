package io.github.newmovieapi.service;

import io.github.newmovieapi.entity.Film;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FilmServiceTest {

    @Autowired
    private FilmService service;

    @Test
    public void shouldGetLukeSkywalkerFilmsReturnValues(){
        List<Film> lukeSkywalkerFilms = service.getLukeSkywalkerFilms();

        Assert.assertNotNull(lukeSkywalkerFilms);
        Assert.assertEquals(lukeSkywalkerFilms.size(), 4);
    }
}