package com.mandal.tm.hack;

public class CipherShiftAntiClockwise {
    String caesarCipher(String encrypted, int k) {
        int len = encrypted.length();
        int i = 0;
        k = k % 26;
        while (encrypted.charAt(i) != '\0') {
            if (encrypted.charAt(i) >= 65 && encrypted.charAt(i) <= 90) {
                if (encrypted.charAt(i) > 90) {
                    //encrypted.charAt(i) = encrypted.charAt(i) + k - 26;
                }

            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}

