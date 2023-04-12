package com.mandal.tm.core;

public class SortArray {
    public int[] sortAscendingArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] myDemoArray = {39, 43, 17, 13, 57, 12, 98};
        SortArray sortArray = new SortArray();
        int[] resultArray = sortArray.sortAscendingArray(myDemoArray);
        System.out.println("After sorting the Array is ....");
        for (int j = 0; j < resultArray.length; j++) {
            System.out.print(resultArray[j] + " ");
        }
    }
}
