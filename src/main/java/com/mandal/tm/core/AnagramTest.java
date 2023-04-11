package com.mandal.tm.core;

import java.util.Arrays;

public class AnagramTest {
    public void checkAnagram(String stringOne, String stringTwo) {
        if (stringOne == null || stringOne.isEmpty()) {
            throw new IllegalArgumentException("stringOne must not be null or blank or empty");
        }
        if (stringTwo == null || stringTwo.isEmpty()) {
            throw new IllegalArgumentException("stringTwo must not be null or blank or empty");
        }
        stringOne = stringOne.replace(" ", "").toLowerCase();
        stringTwo = stringTwo.replace(" ", "").toLowerCase();

        if (stringOne.length() != stringTwo.length()) {
            throw new RuntimeException("String One and String Two must not have same length");
        } else {
            char[] stringOneArray = stringOne.toCharArray();
            char[] stringTwoArray = stringTwo.toCharArray();
            Arrays.sort(stringOneArray);
            Arrays.sort(stringTwoArray);
            boolean isAnagram = Arrays.equals(stringOneArray, stringTwoArray);
            if (isAnagram) {
                System.out.println("String one and String Two are Anagram");
            } else {
                System.out.println("String one and String Two are not Anagram !!!!!");
            }
        }
    }

    public static void main(String[] args) {
        AnagramTest anagramTest = new AnagramTest();
        anagramTest.checkAnagram("Mother in law", "Hitler Woman");
        //anagramTest.checkAnagram("Tapan", "Mandal");
        //anagramTest.checkAnagram("Tapan", "Manda");
        //anagramTest.checkAnagram("Tapan", null);
        //anagramTest.checkAnagram(null, "Tapan");
    }
}
