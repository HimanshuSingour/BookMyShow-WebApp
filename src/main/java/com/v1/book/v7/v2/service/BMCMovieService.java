package com.v1.book.v7.v2.service;

import com.v1.book.v7.v2.dtos.MovieDetailsResponseDTO;
import com.v1.book.v7.v2.dtos.RequestMovieDetailsAdded;
import com.v1.book.v7.v2.dtos.ResponseMovieDetailsAdded;
import com.v1.book.v7.v2.entity.BMCMovieEntity;

import java.util.List;

public interface BMCMovieService {

    ResponseMovieDetailsAdded addMovie(RequestMovieDetailsAdded requestMovieDetailsAdded);

    List<MovieDetailsResponseDTO> findByNameAndLocation(String name, String location);

}
