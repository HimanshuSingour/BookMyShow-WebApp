package com.v1.book.v7.v2.controller;

import com.v1.book.v7.v2.dtos.RequestMovieDetailsAdded;
import com.v1.book.v7.v2.dtos.ResponseMovieDetailsAdded;
import com.v1.book.v7.v2.service.BMCMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bmc/v1/direct")
public class BMSMovieController {

    @Autowired
    private BMCMovieService bmcMovieService;

    @PostMapping("/add")
    ResponseEntity<ResponseMovieDetailsAdded> addingMoviDetailsAddedResponseEntity(@RequestBody RequestMovieDetailsAdded requestMovieDetailsAdded) {
        ResponseMovieDetailsAdded responseMovieDetailsAdded = bmcMovieService.addMovie(requestMovieDetailsAdded);
        return new ResponseEntity<>(responseMovieDetailsAdded, HttpStatus.OK);
    }
}
