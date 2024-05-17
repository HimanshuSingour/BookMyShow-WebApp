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
@Entity
@Table(name = "CUSTM_INFO")
@Builder
public class BMCCustomerEntity {

    @Id
    private Long C_id;
    private String C_Name;
    private String C_Phone;
    private String C_Email;
    private String C_address;

}
