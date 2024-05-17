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
@Table(name = "COMPLIANT_INFO")
@Builder
public class BMCPaymentEntity {

    @Id
    private String paymentId;
    private String paymentType;
    private double amount;
    private String currency;
    private String payerName;
    private String payerAccountNumber;
    private String beneficiaryName;
    private String beneficiaryAccountNumber;
    private String paymentStatus;
    private String paymentDate;
    private String paymentPurpose;
    private String referenceNumber;
    private String paymentMethod;
    private String paymentChannel;
    private String paymentApprovalStatus;
    private String paymentApprovalDate;
    private String paymentInitiatedBy;
    private String paymentRemarks;
}
