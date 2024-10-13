package org.justmeandcode.otp_generator;

import java.security.SecureRandom;

public class NumericOTPGenerator {

    public static String generatePassword(int length) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int number = secureRandom.nextInt(10);
            password.append(number);
        }

        return password.toString();
    }
}


