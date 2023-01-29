package io.github.newmovieapi.repository;

import io.github.newmovieapi.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository  extends JpaRepository<Film, Integer> {
}
