package com.mandal.tm.hack;

/**
 * This is clock wise shift
 */
public class CipherShift {
    static String caesarCipher(String s, int k) {
        String output = "";
        for (int x = 0; x < s.length(); x++) {
            char ch = s.charAt(x);
            if ((ch >= 97 && ch <= 122)) {
                ch = (char) (ch + k);
                while (ch > 122) {
                    ch = (char) (ch - 122 + 96);
                }
            } else if ((ch >= 65 && ch <= 90)) {
                ch = (char) (ch + k);
                while (ch > 90) {
                    ch = (char) (ch - 90 + 64);
                }
            }
            output = output + ch;
        }
        return output;
    }

    public static void main(String[] args) {
        String passed = "TAPAN";
        String result = CipherShift.caesarCipher(passed, 2);
        System.out.println("Output = " + result);
    }

}
