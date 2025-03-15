package com.example.javaProjects;

import java.util.Random;
import java.util.stream.IntStream;

public class Password_Generator {
    public static void main(String[] args) {
        Random rd = new Random();
        String s = "*ABCDEF$GHI&jKLMNOP@QRSTUVWXYZabcd#|efghijklm/nopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        int length = 7;
        for(int i = 0; i < length; i++){
            int a = rd.nextInt(s.length());
            char ch = s.charAt(a);
            sb.append(ch);
        }
        String ns = sb.toString();
        int n = rd.nextInt(1000,9000);
        System.out.println("Password : "+ns+n);

    }
}
