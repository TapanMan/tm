package com.mandal.tm.core;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleValuesPerKey {
    public Map<String, String> carModels() {
        Map<String, String> carModel = new HashMap<>();
        carModel.put("Ford", "GT");
        carModel.put("Dodge", "Viper");
        carModel.put("Ford", "Mustang Mach-E");
        carModel.put("Maruti", "Alto");
        carModel.put("Maruti", "Ignis");
        carModel.put("Maruti", "Dzire");
        carModel.put("Hyundai", "Aura");
        carModel.put("Hyundai", "Verna");
        carModel.put("Hyundai", "Creta");
        return carModel;
    }

    public Map<String, List<String>> carModelsMultipleValue() {
        Map<String, List<String>> carModel = new HashMap<>();

        List<String> marutiList = new ArrayList<>();
        marutiList.add("Alto");
        marutiList.add("Ignis");
        marutiList.add("Dzire");
        marutiList.add("Swift");

        List<String> fordList = new ArrayList<>();
        fordList.add("GT");
        fordList.add("Mustang Mach-E");

        List<String> dodgeList = new ArrayList<>();
        dodgeList.add("Viper");

        List<String> hyundaiList = new ArrayList<>();
        hyundaiList.add("Aura");
        hyundaiList.add("Verna");
        hyundaiList.add("Creta");

        carModel.put("maruti", marutiList);
        carModel.put("ford", fordList);
        carModel.put("dodge", dodgeList);
        carModel.put("hyundai", hyundaiList);

        return carModel;
    }

    public Multimap<String, String> carModelsMultipleValueMultiMap() {
        Multimap<String, String> carMultiMap = ArrayListMultimap.create();

        carMultiMap.put("maruti", "Alto");
        carMultiMap.put("maruti", "Ignis");
        carMultiMap.put("maruti", "Dzire");
        carMultiMap.put("maruti", "Swift");

        carMultiMap.put("ford", "GT");
        carMultiMap.put("ford", "Mustang Mach-E");

        carMultiMap.put("dodge", "Viper");

        carMultiMap.put("hyundai", "Aura");
        carMultiMap.put("hyundai", "Verna");
        carMultiMap.put("hyundai", "Creta");

        return carMultiMap;
    }

    public static void main(String[] args) {
        MultipleValuesPerKey multipleValuesPerKey = new MultipleValuesPerKey();
        System.out.println(multipleValuesPerKey.carModels());
        System.out.println("************************");
        Map<String, List<String>> multiValue = new HashMap<>();

        System.out.println(multipleValuesPerKey.carModelsMultipleValue());

        System.out.println("###############################");
        System.out.println(multipleValuesPerKey.carModelsMultipleValueMultiMap());
    }
}
