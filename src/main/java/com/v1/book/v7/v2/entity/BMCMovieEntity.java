package com.v1.book.v7.v2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private String M_TotalSeats;
    private String M_SeatAvailable;
    private String M_BookedSeat;

    @ElementCollection
    @CollectionTable(name = "seat_price_mapping", joinColumns = @JoinColumn(name = "M_Id"))
    @MapKeyColumn(name = "seat_type")
    @Column(name = "price")
    private Map<String, String> M_SeatPrice;
}
