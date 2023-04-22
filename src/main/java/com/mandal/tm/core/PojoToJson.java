package com.mandal.tm.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class PojoToJson {
    public void createPojoToJson() throws JsonProcessingException {
        Employee employee = new Employee();
        List<Employee> employeeList = employee.getEmployeeDetails();
        ObjectMapper objectMapper = new ObjectMapper();
        String employeeRecords = objectMapper.writeValueAsString(employeeList);
        System.out.println(employeeRecords);
    }

    public static void main(String[] args) throws JsonProcessingException {
        PojoToJson pojoToJson = new PojoToJson();
        pojoToJson.createPojoToJson();
    }
}
