package com.mandal.tm.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public Map<String, Integer> getAllEmployee() {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Tapan", 10000000);
        employeeMap.put("Dillip", 20000000);
        employeeMap.put("Renuka", 30000000);
        employeeMap.put("Kanika", 30000000);
        employeeMap.put("Sumitra", 40000000);
        employeeMap.put("Dipali", 40000000);
        employeeMap.put("Payal", 50000000);
        employeeMap.put("Pankaj", 50000000);
        employeeMap.put("Divya", 50000000);
        return employeeMap;
    }

    public Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> emploeeMap) {
        NthHighestSalary nthHighestSalary = new NthHighestSalary();
        Map<String, Integer> allEmployee = nthHighestSalary.getAllEmployee();
        return allEmployee.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
    }

    // Optimized Result

    public Map.Entry<Integer, List<String>> getNthHighestSalaryExactly(int num, Map<String, Integer> emploeeMap) {
        NthHighestSalary nthHighestSalary = new NthHighestSalary();
        Map<String, Integer> allEmployee = nthHighestSalary.getAllEmployee();
        Map.Entry<Integer, List<String>> desiredHighestSalary = allEmployee.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(num-1);
        return desiredHighestSalary;
    }

    public static void main(String[] args) {

        Map<String, Integer> employeeMapLatest = new HashMap<>();
        employeeMapLatest.put("Tapan", 10000000);
        employeeMapLatest.put("Dillip", 20000000);
        employeeMapLatest.put("Renuka", 30000000);
        employeeMapLatest.put("Kanika", 30000000);
        employeeMapLatest.put("Sumitra", 40000000);
        employeeMapLatest.put("Dipali", 40000000);
        employeeMapLatest.put("Payal", 50000000);
        employeeMapLatest.put("Pankaj", 50000000);
        employeeMapLatest.put("Divya", 50000000);

        NthHighestSalary nthHighestSalary = new NthHighestSalary();
        Map<String, Integer> allEmployee = nthHighestSalary.getAllEmployee();

        // Ascending order
        Map.Entry<String, Integer> result = allEmployee.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).get(1);
        //System.out.println("Ascending Order " + result);
        //System.out.println("**************************************");

        // Descending order
        Map.Entry<String, Integer> resultant = allEmployee.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
        // System.out.println("Descending Order " + resultant);
        //System.out.println("**************************************");

        // Another approach to call
        Map.Entry<String, Integer> resultData = nthHighestSalary.getNthHighestSalary(5, employeeMapLatest);
        //System.out.println("The Result Data " + resultData);

        //The following is the ultimate output, Here 3 is 3rd highest, change this value to 1, 2,and also 4, and 5 and test it
        Map.Entry<Integer, List<String>> salaryExactly = nthHighestSalary.getNthHighestSalaryExactly(3, employeeMapLatest);
        System.out.println("Exact Nth Highest Salary =" + salaryExactly);

    }
}
