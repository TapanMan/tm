package com.mandal.tm.core;

import java.util.Arrays;
import java.util.List;

public class ListSorting {
    public List<String> getAllCountries() {
        List<String> countryList = Arrays.asList("India", "USA", "UK", "France", "Australia", "Brazil", "Finland", "Greece", "Japan");
        return countryList;
    }

    public static void main(String[] args) {
        ListSorting listSorting = new ListSorting();
        List<String> countries = listSorting.getAllCountries();
        countries.stream().sorted().forEach(k -> {
            System.out.println(k);
        });
    }
}
