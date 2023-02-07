package com.mandal.tm.utils;

import com.mandal.tm.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc1", 12000.0);
        paymentMap.put("acc2", 14000.0);
        paymentMap.put("acc3", 11000.0);
        paymentMap.put("acc4", 13000.0);
    }

    public static boolean validateCreditLimit(String account, Double paidAmount) {
        if (paidAmount > paymentMap.get(account)) {
            throw new InsufficientAmountException("Your Amount is less than the Balance in the Account");
        } else {
            return true;
        }
    }
}
