package com.v1.book.v7.v2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "BOOKED_DETAILS")
public class BMSBookedDetailsEntity {

    @Id
    private String B_id;
    private String B_TicketNumber;
    private String B_CustomerName;
    private String B_MovieName;
    private String B_CustomerAddress;
    private String B_MovieLocation;
    private String B_SeatNumber;
    private String B_SeatPrice;

}
