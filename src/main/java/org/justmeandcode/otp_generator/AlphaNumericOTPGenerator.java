package org.justmeandcode.otp_generator;

import java.security.SecureRandom;

public class AlphaNumericOTPGenerator {
    private static final String NUMBER_CHAR_SET= "0123456789";
    private static final String UPPERCASE_CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_CHAR_SET = UPPERCASE_CHAR_SET.toLowerCase();

    public static String generateAlphaNumericPassword(int length) {
        String combineCharSet = NUMBER_CHAR_SET.concat(UPPERCASE_CHAR_SET).concat(LOWERCASE_CHAR_SET);
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(combineCharSet.length());
            sb.append(combineCharSet.charAt(number));
        }

        return sb.toString();
    }
}
