package com.mandal.tm.core;

public class PalindromeCheck {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeCheck check = new PalindromeCheck();
        String dataCheck = "Madam";
        boolean isPalindrome = check.isPalindrome(dataCheck);
        if (isPalindrome) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}
