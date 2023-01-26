package io.github.starwarsapi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class People {

    private String name;
    private List<String> films;
    private String url;
}
