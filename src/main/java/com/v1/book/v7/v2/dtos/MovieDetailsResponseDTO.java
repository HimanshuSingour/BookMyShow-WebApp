package com.v1.book.v7.v2.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailsResponseDTO {

    private String M_Location;
    private String M_Name;
    private String M_HallName;
    private String M_TotalSeats;
    private String M_SeatAvailable;
    private String M_BookedSeat;
    private Map<String, String> M_SeatPrice;
}
