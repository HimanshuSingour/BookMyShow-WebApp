package com.v1.book.v7.v2.service.impl;

import com.v1.book.v7.v2.dtos.MovieDetailsResponseDTO;
import com.v1.book.v7.v2.dtos.RequestMovieDetailsAdded;
import com.v1.book.v7.v2.dtos.ResponseMovieDetailsAdded;
import com.v1.book.v7.v2.entity.BMCMovieEntity;
import com.v1.book.v7.v2.mapper.ConverterToEntities;
import com.v1.book.v7.v2.repositories.BMCMovieRepositories;
import com.v1.book.v7.v2.repositories.BMCMovieSpecification;
import com.v1.book.v7.v2.service.BMCMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BMSMovieServiceImpl implements BMCMovieService {

    @Autowired
    private BMCMovieRepositories bmcMovieRepositories;

    @Autowired
    private ConverterToEntities converterToEntities;

    @Autowired
    private BMCMovieSpecification bmcMovieSpecification;


    @Override
    public ResponseMovieDetailsAdded addMovie(RequestMovieDetailsAdded requestMovieDetailsAdded) {
        BMCMovieEntity bmcMovieEntity = converterToEntities.convertToEntity(requestMovieDetailsAdded);
        bmcMovieRepositories.save(bmcMovieEntity);
        ResponseMovieDetailsAdded responseMovieDetailsAdded = converterToEntities.convertToResponse(bmcMovieEntity);
        return responseMovieDetailsAdded;
    }

    @Override
    public List<MovieDetailsResponseDTO> findByNameAndLocation(String name, String location) {
        Specification<BMCMovieEntity> spec = bmcMovieSpecification.withNameAndLocation(name, location);
        List<BMCMovieEntity> movieEntities = bmcMovieRepositories.findAll(spec);
        return movieEntities.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private MovieDetailsResponseDTO convertToDTO(BMCMovieEntity movieEntity) {
        return new MovieDetailsResponseDTO(movieEntity.getM_Location(),
                movieEntity.getM_Name(), movieEntity.getM_HallName(),
                movieEntity.getM_TotalSeats(), movieEntity.getM_SeatAvailable(),
                movieEntity.getM_BookedSeat(), movieEntity.getM_SeatPrice());
    }
}
