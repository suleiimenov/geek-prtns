package com.example.geekprtn.utils;

public class Generator {

    public static String generate(String str) {
        char[] chars = str.toCharArray();
        int carry = 1;
        for(int i = chars.length - 1; i >= 0; i--) {
            if(carry == 0) {
                break;
            }
            if(chars[i] <= '9' ||
                    chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i]+=carry;
                carry--;
            }
            if(chars[i] == 58) {
                chars[i] = '0';
                carry++;
            } else if(chars[i] == 123) {
                chars[i] = 'a';
                carry++;
            }
        }

        StringBuilder sb = new StringBuilder(String.valueOf(chars));
        sb.reverse();
        if(carry == 1 && chars[0] == 'a'){
            sb.append("0a");
        }
        sb.reverse();
        str = sb.toString();
        return str;
    }
}
