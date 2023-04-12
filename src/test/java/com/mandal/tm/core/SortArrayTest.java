package com.mandal.tm.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(SpringExtension.class)
class SortArrayTest {
    private static SortArray sortArray;

    @BeforeAll
    public static void setUp() {
        sortArray = new SortArray();
    }

    @TestFactory
    public Collection<DynamicTest> sortAscendingArray() {
        Collection<DynamicTest> dynamicTests = new ArrayList<>();
        int[] givenArray = {39, 43, 17, 13, 57, 12};
        int[] expected = {12, 13, 17, 39, 43, 57};
        int[] actual = sortArray.sortAscendingArray(givenArray);
        Executable executable = () -> assertArrayEquals(expected, actual);
        DynamicTest dynamicTest = DynamicTest.dynamicTest("Sort Array", executable);
        dynamicTests.add(dynamicTest);
        return dynamicTests;
    }
}