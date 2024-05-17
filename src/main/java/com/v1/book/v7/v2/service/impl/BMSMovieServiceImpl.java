package com.v1.book.v7.v2.service.impl;

import com.v1.book.v7.v2.dtos.RequestMovieDetailsAdded;
import com.v1.book.v7.v2.dtos.ResponseMovieDetailsAdded;
import com.v1.book.v7.v2.entity.BMCMovieEntity;
import com.v1.book.v7.v2.mapper.ConverterToEntities;
import com.v1.book.v7.v2.repositories.BMCMovieRepositories;
import com.v1.book.v7.v2.service.BMCMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BMSMovieServiceImpl implements BMCMovieService {

    @Autowired
    private BMCMovieRepositories bmcMovieRepositories;

    @Autowired
    private ConverterToEntities converterToEntities;


    @Override
    public ResponseMovieDetailsAdded addMovie(RequestMovieDetailsAdded requestMovieDetailsAdded) {
        BMCMovieEntity bmcMovieEntity = converterToEntities.convertToEntity(requestMovieDetailsAdded);
        bmcMovieRepositories.save(bmcMovieEntity);
        ResponseMovieDetailsAdded responseMovieDetailsAdded = converterToEntities.convertToResponse(bmcMovieEntity);
        return responseMovieDetailsAdded;
    }
}
