package lesson20;

public class HolidayHomeworkString {
    public static void main(String[] args) {
        //Given two strings, a and b, return the result of putting
        // them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        System.out.println(makeAbba("Hi", "Bye"));//→"HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice"));//→"YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up"));//→"WhatUpUpWhat"
        System.out.println();
        //Given a string, return a new string made
        // of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
        System.out.println(extraEnd("Hello"));// →"lololo"
        System.out.println(extraEnd("ab"));// →"ababab"
        System.out.println(extraEnd("l"));//→""
        System.out.println(extraEnd("Hi"));//→"HiHiHi"
        System.out.println();
        //Given a string, return a version without the first and last char,
        // so "Hello" yields "ell". The string length will be at least 2.
        System.out.println(withoutEnd("Hello"));// →"ell"
        System.out.println(withoutEnd("java"));// →"av"
        System.out.println(withoutEnd("j"));// →""
        System.out.println(withoutEnd("coding"));// →"odin"
        System.out.println();
        //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
        // The string length will be at least 2.
        System.out.println(left2("Hello"));//→"lloHe"
        System.out.println(left2("java"));//→"vaja"
        System.out.println(left2("Hi"));//→"Hi"
        System.out.println();
        //Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
        // such as with "badxxx" or "xbadxx" but not "xxbadxx".
        // The string may be any length, including 0. Note: use .equals() to compare 2 strings.
        System.out.println(hasBad("badxx"));// →true
        System.out.println(hasBad("xbadxx"));// →true
        System.out.println(hasBad("xxbadxx"));// →false
        System.out.println(hasBad("bx"));// →false
        System.out.println(hasBad("xxxxxxbadxx"));// →false

    }

    private static boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.substring(1, 4).equals("bad")) {
            return true;
        } else
            return false;
    }

    private static boolean hasBadTwo(String str) {
        for (int i = 0; i < 2; i++) {
            if (str.charAt(i) == 'b'
                    && str.charAt(i + 1) == 'a'
                    && str.charAt(i + 2) == 'd') {
                return true;
            }
        }
        return false;
    }

    private static String left2(String str) {
        if (str.length() >= 2) {
            return str.substring(2, str.length()) + str.substring(0, 2);
        } else
            return "";
    }

    private static String withoutEnd(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        } else
            return "";
    }

    private static String extraEnd(String a) {
        if (a.length() >= 2) {
            String last2Letters = a.substring(a.length() - 2, a.length());
            return last2Letters + last2Letters + last2Letters;
        } else
            return "";
    }

    private static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
