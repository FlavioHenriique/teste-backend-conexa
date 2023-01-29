package io.github.newmovieapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StarWarsApiResponse {

    private int status;
    private String message;
    private List<Film> result;
}
