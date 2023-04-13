package com.mandal.tm.core;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCheck {
    public void characterFrequency(String str) {
        char[] characters = str.toCharArray();
        Map<Character, Integer> myMap = new HashMap<>();
        for (char character : characters) {
            if (!myMap.containsKey(character)) {
                myMap.put(character, 1);
            } else {
                myMap.put(character, myMap.get(character) + 1);
            }
        }
        myMap.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
    }

    public static void main(String[] args) {
        CharacterFrequencyCheck frequencyCheck = new CharacterFrequencyCheck();
        frequencyCheck.characterFrequency("TapanMandal");
        //frequencyCheck.characterFrequency("Alok");
    }
}
