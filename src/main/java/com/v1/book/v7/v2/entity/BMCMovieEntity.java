package com.v1.book.v7.v2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOVIE_INFO")
@Builder
public class BMCMovieEntity {

    @Id
    private String M_Id;
    private String M_Location;
    private String M_Name;
    private String M_HallName;
}
