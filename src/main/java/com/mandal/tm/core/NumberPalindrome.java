package com.mandal.tm.core;

public class NumberPalindrome {
    public void palindromeCheck(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum = sum * 10 + remainder;
            number = number / 10;
        }
        boolean isPalindrome = originalNumber == sum ? true : false;
        if (isPalindrome) {
            System.out.println(originalNumber + " is a palindrome");
        } else {
            System.out.println(originalNumber + " is not a palindrome !!!!");
        }
    }

    public static void main(String[] args) {
        NumberPalindrome numberPalindrome = new NumberPalindrome();
        numberPalindrome.palindromeCheck(1331);
        numberPalindrome.palindromeCheck(132);
    }
}
