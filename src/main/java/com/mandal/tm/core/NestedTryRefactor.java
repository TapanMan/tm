package com.mandal.tm.core;

public class NestedTryRefactor {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            try {
                int b = 0;
                int c = 1/b;
            }catch(Exception e) {
                System.out.println("Exception thrown: " + e);
            }
            System.out.println("Access element three :" + a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }

    // The inner try block from line 7 to 12 select it and alt+ctrl+m
    //Give a new name, that will be refactored
}


