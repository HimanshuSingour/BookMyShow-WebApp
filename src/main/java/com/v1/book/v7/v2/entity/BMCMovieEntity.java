package com.v1.book.v7.v2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

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

    @OneToOne
    private BMSMovieDetailsEntity bmsMovieDetailsEntity;

    private List<String> M_SeatTypes;
    private String M_TotalSeats;
    private String M_SeatAvailable;
    private String M_BookedSeat;

    private Map<String, String> M_SeatPrice;
}
