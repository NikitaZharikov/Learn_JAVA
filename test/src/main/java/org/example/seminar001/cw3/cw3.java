package org.example.seminar001.cw3;

public class cw3 {
    public static void main(String[] args) {
        System.out.println(replacePartOfString("Hi Hello Hi Hello......."));
    }

    public static String replacePartOfString(String str) {
        int length = str.length();
        String sub1 = str.substring(0, length / 2);
        String sub2 = str.substring(length / 2, length);

        return sub2 + sub1;
    }
}

