package com.v1.book.v7.v2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOVI_DETAILS")
@Builder
public class BMSMovieDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MD_id;
    private String MD_title;
    private String MD_description;
    private Date MD_releaseDate;
    private String MD_genre;
    private String MD_director;
    private List<String> MD_cast;
    private Double MD_rating;
    private Integer MD_duration;
}
