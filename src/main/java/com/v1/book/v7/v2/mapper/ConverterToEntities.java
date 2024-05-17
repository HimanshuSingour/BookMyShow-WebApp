package com.v1.book.v7.v2.mapper;

import com.v1.book.v7.v2.dtos.RequestMovieDetailsAdded;
import com.v1.book.v7.v2.dtos.ResponseMovieDetailsAdded;
import com.v1.book.v7.v2.entity.BMCMovieEntity;
import org.springframework.stereotype.Service;

@Service
public class ConverterToEntities {

    public BMCMovieEntity convertToEntity(RequestMovieDetailsAdded requestMovieDetailsAdded) {
        return BMCMovieEntity.builder()
                .M_Location(requestMovieDetailsAdded.getM_Location())
                .M_Name(requestMovieDetailsAdded.getM_Name())
                .M_HallName(requestMovieDetailsAdded.getM_HallName())
                .M_TotalSeats(requestMovieDetailsAdded.getM_TotalSeats())
                .M_SeatAvailable(requestMovieDetailsAdded.getM_SeatAvailable())
                .M_BookedSeat(requestMovieDetailsAdded.getM_BookedSeat())
                .M_SeatPrice(requestMovieDetailsAdded.getM_SeatPrice())
                .build();
    }

    public ResponseMovieDetailsAdded convertToResponse(BMCMovieEntity bmcMovieEntity) {
        return ResponseMovieDetailsAdded.builder()
                .M_Location(bmcMovieEntity.getM_Location())
                .M_Name(bmcMovieEntity.getM_Name())
                .M_HallName(bmcMovieEntity.getM_HallName())
                .M_TotalSeats(bmcMovieEntity.getM_TotalSeats())
                .M_SeatAvailable(bmcMovieEntity.getM_SeatAvailable())
                .M_BookedSeat(bmcMovieEntity.getM_BookedSeat())
                .M_SeatPrice(bmcMovieEntity.getM_SeatPrice())
                .build();
    }
}
