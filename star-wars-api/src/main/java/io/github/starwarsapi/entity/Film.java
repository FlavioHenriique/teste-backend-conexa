package io.github.starwarsapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@
@Getter
@Setter
@NoArgsConstructor
public class Film {

    private String title;
    private String director;
    private int episode_id;
    private String release_date;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<String> characters;
}
