package com.haider.url_shortner.service;

public class Base62Encoder {

    private static final String BASE62_CHARS =
            "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int BASE = 62;

    // Encode a number to Base62 string
    public static String encode(long value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }

        if (value == 0) {
            return String.valueOf(BASE62_CHARS.charAt(0));
        }

        StringBuilder encoded = new StringBuilder();

        while (value > 0) {
            int remainder = (int) (value % BASE);
            encoded.append(BASE62_CHARS.charAt(remainder));
            value /= BASE;
        }

        return encoded.reverse().toString();
    }

    // Decode Base62 string back to number
    public static long decode(String base62) {
        long decoded = 0;

        for (char c : base62.toCharArray()) {
            int index = BASE62_CHARS.indexOf(c);
            if (index == -1) {
                throw new IllegalArgumentException("Invalid Base62 character: " + c);
            }
            decoded = decoded * BASE + index;
        }

        return decoded;
    }
}
