package com.mandal.tm.core;

import java.util.Scanner;

public class PermutationCombination {
    public int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public void generatePermutationCombination() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n = scanner.nextInt();
        System.out.println("Enter value of r ");
        int r = scanner.nextInt();

        System.out.println("Do you want NPR or NCR? For NPR type NPR ad For NCR type NCR");
        String nprNcr = scanner.next();
        nprNcr = nprNcr.toLowerCase();
        switch (nprNcr) {
            case "ncr":
                int ncr = factorial(n) / (factorial(r) * factorial(n - r));
                System.out.println("The NCR is " + ncr);
                break;
            case "npr":
                int npr = factorial(n) / (factorial(n - r));
                System.out.println("The NPR is " + npr);
                break;
            default:
                System.out.println("You have provided the wrong input");
        }
    }

    public static void main(String[] args) {
        PermutationCombination pc = new PermutationCombination();
        pc.generatePermutationCombination();
    }
}
