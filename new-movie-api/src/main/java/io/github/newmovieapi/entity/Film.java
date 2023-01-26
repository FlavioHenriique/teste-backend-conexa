package io.github.newmovieapi.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", episode_id=" + episode_id +
                ", release_date='" + release_date + '\'' +
                ", characters=" + characters +
                '}';
    }
}
