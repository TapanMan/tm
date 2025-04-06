package com.mandal.tm.hack;

class Main {
    static String SmallestString(String S, char ch){
        for(int i = 0; i < S.length(); i++) {
            if (S.charAt(i) > ch) {
                String temp = S;
                S = S.substring(0, i);
                S += ch;
                S += temp.substring(i, temp.length());
                return S;
            }
        }
        S += ch;
        return S;
    }

    public static void main(String args[]) {
        // Your code goes here
        String s = "axc";
        char ch = 'b';
        System.out.print(SmallestString(s, ch));
    }
}