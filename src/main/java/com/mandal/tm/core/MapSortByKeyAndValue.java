package com.mandal.tm.core;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapSortByKeyAndValue {
    public Map<String, String> countryCapital() {
        Map<String, String> countryAndCapital = new HashMap<>();
        countryAndCapital.put("India", "New Delhi");
        countryAndCapital.put("France", "Paris");
        countryAndCapital.put("UK", "London");
        countryAndCapital.put("USA", "Washington DC");
        countryAndCapital.put("Australia", "Canberra");
        countryAndCapital.put("Brazil", "Brasilia");
        countryAndCapital.put("Finland", "Helsinki");
        countryAndCapital.put("Greece", "Athens");
        countryAndCapital.put("Japan", "Tokyo");
        return countryAndCapital;
    }

    public static void main(String[] args) {
        MapSortByKeyAndValue mapSortByKeyAndValue = new MapSortByKeyAndValue();
        Map<String, String> myMap = mapSortByKeyAndValue.countryCapital();
        // Country and Capital in the ascending order of key
        // Inside the Sorted() we can do the Comparator.comparing
        myMap.entrySet().stream().sorted((k1, k2) -> k1.getKey().compareTo(k2.getKey())).forEach((k) -> {
            System.out.println(k.getKey() + " capital " + k.getValue());
        });
        // Country and Capital in the ascending order of value in another way
        System.out.println("============================================");
        myMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach((k) -> {
            System.out.println(k.getKey() + " capital " + k.getValue());
        });
    }
}
