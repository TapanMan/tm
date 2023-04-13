package com.mandal.tm.core;

public class FibonaciSeries {
    public void fibonaciSeries(int numberOfTerms) {
        int f1 = 0;
        int f2 = 1;
        System.out.println(f1);
        System.out.println(f2);
        for (int i = 0; i < numberOfTerms - 2; i++) {
            int f3 = f1 + f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }
    }

    public static void main(String[] args) {
        FibonaciSeries series = new FibonaciSeries();
        series.fibonaciSeries(12);
    }
}
