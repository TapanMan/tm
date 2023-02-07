package com.mandal.tm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYMENT_INFO")
public class PaymentInfo {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "PAYMENT_ID")
    private String paymentId;

    @Column(name = "ACCOUNT_NUMBER")
    private String accountNo;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "CARD_TYPE")
    private String cardType;

    @Column(name = "PASSENGER_ID")
    private Long passengerId;
}
