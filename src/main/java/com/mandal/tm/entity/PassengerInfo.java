package com.mandal.tm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PASSENGER_INFO")
public class PassengerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PASS_SEQ")
    @SequenceGenerator(name = "PASS_SEQ", sequenceName = "pax_sequence", allocationSize = 1)
    @Column(name = "PID")
    private Long pId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "DESTINATION")
    private String destination;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "TRAVEL_DATE")
    private Date travelDate;

    @Column(name = "PICKUP_TIME")
    private String pickupTime;

    @Column(name = "ARRIVAL_TIME")
    private String arrivalTime;

    @Column(name = "FARE")
    private Double fare;

}
