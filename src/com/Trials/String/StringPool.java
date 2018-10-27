package com.Trials.String;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Dog";
        String s4 = "Cat";
        String s3 = new String("Cat");

        System.out.println("s1 == s4 :"+(s1==s4));
        System.out.println("s1 == s3 :"+(s1==s3));
    }
}
