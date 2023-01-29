package io.github.newmovieapi.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Film {

    private String title;
    private String director;
    @Id
    private int episode_id;
    private String release_date;
    @ElementCollection
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
