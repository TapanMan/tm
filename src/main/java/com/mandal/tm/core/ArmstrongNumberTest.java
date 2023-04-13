package com.mandal.tm.core;

public class ArmstrongNumberTest {
    public void armstrongCheck(int number) {
        int originalNumber = number;
        double sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum = sum + Math.pow(remainder, 3);
            number = number / 10;
        }
        boolean isArmstrong = originalNumber == sum ? true : false;
        if (isArmstrong) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number !!!!");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumberTest armstrongNumberTest = new ArmstrongNumberTest();
        armstrongNumberTest.armstrongCheck(371);
        armstrongNumberTest.armstrongCheck(372);
    }
}
