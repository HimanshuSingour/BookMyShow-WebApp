package com.v1.book.v7.v2.repositories;

import com.v1.book.v7.v2.entity.BMCMovieEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;


@Component
public class BMCMovieSpecification {

    public Specification<BMCMovieEntity> hasName(String name) {
        return (Root<BMCMovieEntity> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
            if (name == null || name.isEmpty()) {
                return builder.conjunction();
            }
            return builder.equal(root.get("M_Name"), name);
        };
    }

    public Specification<BMCMovieEntity> hasLocation(String location) {
        return (Root<BMCMovieEntity> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
            if (location == null || location.isEmpty()) {
                return builder.conjunction();
            }
            return builder.equal(root.get("M_Location"), location);
        };
    }

    public Specification<BMCMovieEntity> withNameAndLocation(String name, String location) {
        return Specification.where(hasName(name)).and(hasLocation(location));
    }
}
