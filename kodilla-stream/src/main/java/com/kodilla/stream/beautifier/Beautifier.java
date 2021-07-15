package com.kodilla.stream.beautifier;

public class Beautifier {

    public static String textUperCase(String text) {
        return text.toUpperCase();
    }

    public static String abcTextAbc(String text) {
        return "ABC " + text + " ABC";
    }

    public static String textToLowerCase(String text) {
        return text.toLowerCase();
    }

    public static String trimText(String text) {
        return text.trim();
    }

    public static String replaceChar(String text) {
        return text.replace('a', '4');
    }

    public static String waveText(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            int modulo = (i + 2) % 2;
            if (modulo == 0) {
                String bigChar = String.valueOf(text.charAt(i)).toUpperCase();
                newText = newText + bigChar;
            } else {
                String smallChar = String.valueOf(text.charAt(i)).toLowerCase();
                newText = newText + smallChar;
            }
        }
        return "*** " + newText + " ***";
    }

    public static String reverseText(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            String reverse = String.valueOf(text.charAt(text.length() - (1 + i)));
            newText = newText + reverse;
        }
        return newText;
    }
}
