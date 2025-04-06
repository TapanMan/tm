package com.mandal.tm.core;

public class StringFormatMore {
    public static void main(String[] args) {
        String firstName = "Tapan";
        String address = "Bangalore, India";
        Integer accountNumber = 123456789;
        String contactDetails = String.format("My name is %s and I stay in %s, and my - account number  %d", firstName, address, accountNumber);
        System.out.println(contactDetails);
    }
}
