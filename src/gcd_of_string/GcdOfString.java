package gcd_of_string;

import java.awt.*;

public class GcdOfString {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        int length1 = str1.length();
        int length2 = str2.length();
        int gcd = gcd(length1, length2);
        return str1.substring(0, gcd);
    }

    public int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return b == 0 ? a : gcd(b, a % b);
        }
        return a == 0 ? b : gcd(a, b % a);
    }

    public static void main(String[] args) {
        GcdOfString gcdOfString = new GcdOfString();
        String s = gcdOfString.gcdOfStrings("ABCDEF", "ABC");
        System.out.println(s);
    }
}
