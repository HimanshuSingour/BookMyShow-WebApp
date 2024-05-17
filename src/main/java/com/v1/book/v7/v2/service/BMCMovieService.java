package com.v1.book.v7.v2.service;

import com.v1.book.v7.v2.dtos.RequestMovieDetailsAdded;
import com.v1.book.v7.v2.dtos.ResponseMovieDetailsAdded;

public interface BMCMovieService {

    ResponseMovieDetailsAdded addMovie(RequestMovieDetailsAdded requestMovieDetailsAdded);
}
