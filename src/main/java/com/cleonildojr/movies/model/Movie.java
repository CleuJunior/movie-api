package com.cleonildojr.movies.model;

import com.cleonildojr.movies.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDate;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Document(collection = "movies")
public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private LocalDate releaseDate;
    private String trailerLink;
    private String poster;
    private List<Genre> genres;
    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;

}
