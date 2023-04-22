package com.mandal.tm.core;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer empId;
    private String firstName;
    private String lastName;
    private Double salary;
    @JsonManagedReference // This is for forward
    private City city;
    @JsonManagedReference  // This is for forward
    private Address address;

    @JsonBackReference  // This is for backward
    // If we don't implement these above two then will encounter [Infinite recursion (StackOverflowError)]
    public List<Employee> getEmployeeDetails() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = Employee.builder().empId(44).firstName("Tapan").lastName("Mandal").salary(5190000.00).city(new City("Bangalore", "India")).address(new Address(8, "Doddanekundi")).build();
        Employee employee2 = Employee.builder().empId(45).firstName("Dillip").lastName("Mandal").salary(6190000.00).city(new City("Cuttack", "India")).address(new Address(9, "SchoolGheri")).build();
        Employee employee3 = Employee.builder().empId(46).firstName("Payal").lastName("Mandal").salary(6290000.00).city(new City("New York", "USA")).address(new Address(10, "Washington Street")).build();
        Employee employee4 = Employee.builder().empId(47).firstName("Pankaj").lastName("Mandal").salary(6390000.00).city(new City("London", "Britain")).address(new Address(11, "downing street")).build();
        Employee employee5 = Employee.builder().empId(48).firstName("Divya").lastName("Mandal").salary(6490000.00).city(new City("Paris", "France")).address(new Address(12, "Rue de Vaugirard")).build();
        employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
        return employeeList;
    }
}
