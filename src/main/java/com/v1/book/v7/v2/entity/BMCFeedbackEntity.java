package com.v1.book.v7.v2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FEEDBACK_INFO")
@Builder
public class BMCFeedbackEntity {


    @Id
    private Long F_id;
    private Long F_movieId;
    private Long F_userId;
    private Double F_rating;
    private String F_comment;
    private Date F_timestamp;

}
