package com.company;

public class Main {

    public static void main(String[] args) {
        String str1="apkzube";
        String str2="";
        String str3=null;
        boolean b;
        b=(str1==null || str2.length()==0 );
        System.out.println("string 1 is null or empty?"+b);
        b=(str2==null || str2.length()==0);
        System.out.println("string 2 is null or empty?"+b);
        b=(str3==null || str3.length()==0);
        System.out.println("string 3 is null or empty?"+b);
	// write your code here
    }
}
