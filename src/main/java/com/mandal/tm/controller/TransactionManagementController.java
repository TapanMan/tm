package com.mandal.tm.controller;

import com.mandal.tm.dto.FlightBookingAcknowledgement;
import com.mandal.tm.dto.FlightBookingRequest;
import com.mandal.tm.entity.PassengerInfo;
import com.mandal.tm.repository.PassengerInfoRepository;
import com.mandal.tm.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionManagementController {

    // Testing purposes I have used below 2 APIs
    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private FlightBookingService flightBookingService;

    @GetMapping("/hello")

    public String sayHello() {
        return "Hello From Transaction Management 88887777";
    }

    @PostMapping("/addpass")
    public String addInfo(@RequestBody PassengerInfo passengerInfo) {
        passengerInfoRepository.save(passengerInfo);
        return "successfully added the passenger";
    }

    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return flightBookingService.bookFlightTicket(request);
    }

}
