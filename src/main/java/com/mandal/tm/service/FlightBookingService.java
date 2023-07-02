package com.mandal.tm.service;

import com.mandal.tm.dto.FlightBookingAcknowledgement;
import com.mandal.tm.dto.FlightBookingRequest;
import com.mandal.tm.entity.PassengerInfo;
import com.mandal.tm.entity.PaymentInfo;
import com.mandal.tm.repository.PassengerInfoRepository;
import com.mandal.tm.repository.PaymentInfoRepository;
import com.mandal.tm.utils.PaymentUtils;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {


        PassengerInfo paxInfo = request.getPassengerInfo();
        passengerInfoRepository.save(paxInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), paxInfo.getFare());

        paymentInfo.setPassengerId(paxInfo.getPId());
        paymentInfo.setAmount(paxInfo.getFare());

        paymentInfoRepository.save(paymentInfo);

        return new FlightBookingAcknowledgement("SUCCESS", paxInfo.getFare(), UUID.randomUUID().toString().split("-")[0], paxInfo);

    }

}
