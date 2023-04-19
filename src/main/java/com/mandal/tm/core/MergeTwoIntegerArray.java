package com.mandal.tm.core;

import java.util.Arrays;

public class MergeTwoIntegerArray {
    public void mergeTwoArrays(int[] a, int[] b) {
        int count = 0;
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[count] = a[i];
            count = count + 1;
        }
        for (int j = 0; j < b.length; j++) {
            c[count] = b[j];
            count = count + 1;
        }
        Arrays.sort(c);
        System.out.println("After sorting the Array ");

        for (int i : c) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MergeTwoIntegerArray array = new MergeTwoIntegerArray();
        int[] a = {10, 20, 30, 65, 8, 5};
        int[] b = {48, 60, 50, 35, 70, 75};
        array.mergeTwoArrays(a, b);
    }
}
