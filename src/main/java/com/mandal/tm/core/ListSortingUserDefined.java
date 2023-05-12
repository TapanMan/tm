package com.mandal.tm.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortingUserDefined {
    public List<Person> getAllPersons() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(12L, "Tapan", "Doddanekundi, Bangalore", 12345678.0, 45));
        personList.add(new Person(14L, "Dillip", "School Gheri, Kendrapara", 12345688.0, 41));
        personList.add(new Person(16L, "Payal", "OAV Kendrapara, Kendrapara", 22345678.0, 15));
        personList.add(new Person(18L, "Pankaj", "SSM, Boulkani", 32345678.0, 12));
        personList.add(new Person(22L, "Divya", "Marathalhi, Bangalore", 42345678.0, 03));
        return personList;
    }

    public static void main(String[] args) {
        ListSortingUserDefined sortingUserDefined = new ListSortingUserDefined();
        List<Person> allPersons = sortingUserDefined.getAllPersons();
        // Sort By Identity
        allPersons.stream().sorted(Comparator.comparing(Person::getId)).forEach(k -> {
            System.out.println("Id=" + k.getId() + " Name=" + k.getFirstname() + " Address=" + k.getAddress() + " Salary=" + k.getSalary() + " Age=" + k.getAge());
        });
        System.out.println("========================");
        // Sort by Name
        allPersons.stream().sorted(Comparator.comparing(Person::getFirstname)).forEach(k -> {
            System.out.println("Id=" + k.getId() + " Name=" + k.getFirstname() + " Address=" + k.getAddress() + " Salary=" + k.getSalary() + " Age=" + k.getAge());
        });

        System.out.println("**************************");
        // Sort by Name then Age
        allPersons.stream().sorted(Comparator.comparing(Person::getFirstname).thenComparing(Person::getAge)).forEach(k -> {
            System.out.println("Id=" + k.getId() + " Name=" + k.getFirstname() + " Address=" + k.getAddress() + " Salary=" + k.getSalary() + " Age=" + k.getAge());
        });
    }
}
