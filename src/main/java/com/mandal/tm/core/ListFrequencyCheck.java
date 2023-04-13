package com.mandal.tm.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListFrequencyCheck {
    public void frequencyCheck(List<String> myList) {
        Map<String, Integer> myMap = new HashMap<>();
        for (String str : myList) {
            if (!myMap.containsKey(str)) {
                myMap.put(str, 1);
            } else {
                myMap.put(str, myMap.get(str) + 1);
            }
        }
        myMap.forEach((key, value)->{
            System.out.println(key + " = "+value);
        });
    }

    public static void main(String[] args) {
        List<String> givenList = Arrays.asList("Tapan", "Dillip","Tapan","Dillip","Tapan","Divya","Tapan", "Payal");
        ListFrequencyCheck listFrequencyCheck = new ListFrequencyCheck();
        listFrequencyCheck.frequencyCheck(givenList);
    }
}
