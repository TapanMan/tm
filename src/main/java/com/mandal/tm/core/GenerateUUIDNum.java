package com.mandal.tm.core;

import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateUUIDNum {

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        for (int count = 0; count < 100000; count++) {
            SecureRandom secureRandom = new SecureRandom();
            long randomPositiveLong = Math.abs(secureRandom.nextLong());
            list.add(randomPositiveLong);
        }
        writeToFile(list);
        List<Long> uniqueList = list.stream().distinct().collect(Collectors.toList());
        if (uniqueList.size() == list.size()) {
            System.out.println("All Unique Values");
        } else {
            System.out.println("Duplicate Values are present");
        }
    }

    private static void writeToFile(List<Long> list) {
        try {
            FileWriter writer = new FileWriter("C:\\UUID\\output.txt");
            for (Long num : list) {
                writer.write(num + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
