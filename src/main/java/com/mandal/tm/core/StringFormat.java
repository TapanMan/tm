package com.mandal.tm.core;

public class StringFormat {
    public static void main(String[] args) {
        String firstName = "Tapan";
        String address = "Bangalore, India";
        String contactDetails = String.format("My name is %s and I stay in %s", firstName, address);
        System.out.println(contactDetails);
    }
}
