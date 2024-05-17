package com.v1.book.v7.v2.repositories;

import com.v1.book.v7.v2.entity.BMCMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BMCMovieRepositories extends JpaRepository<BMCMovieEntity, String> {
}
