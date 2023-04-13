package com.mandal.tm.core;

import java.util.Scanner;

public class LCMAndHCF {
    public void checkLCMAndHCF(int numberOne, int numberTwo) {
        int originalNumberOne = numberOne;
        int originalNumberTwo = numberTwo;
        int productOfNumbers = originalNumberOne * originalNumberTwo;
        while (numberOne != numberTwo) {
            if (numberOne > numberTwo) {
                numberOne = numberOne - numberTwo;
            } else {
                numberTwo = numberTwo - numberOne;
            }
        }
        int lCM = productOfNumbers / numberOne;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your option from LCM and HCF: LCM, HCF");
        String str = scanner.next();
        str = str.toLowerCase();
        switch (str) {
            case "lcm":
                System.out.println("The LCM of " + originalNumberOne + " and " + originalNumberTwo + " is " + lCM);
                break;

            case "hcf":
                System.out.println("The HCF of " + originalNumberOne + " and " + originalNumberTwo + " is " + numberOne);
                break;
            default:
                System.out.println("You have provided wrong input  " + str);
        }
    }

    public static void main(String[] args) {
        LCMAndHCF lcmAndHCF = new LCMAndHCF();
        lcmAndHCF.checkLCMAndHCF(500, 100);
        lcmAndHCF.checkLCMAndHCF(24, 48);
    }
}
