package com.chamratt.oop;

public class Chamratt {
    public static void main(String[] args) {
        Integer[] aray = {1,2,3,4,5,6,7,8};
        Character[] bray = {'c','h','a','m','r','a','t','t'};

        printMe(aray);
        printMe(bray);
    }
    public static <T> void printMe(T[] x){
        for (T b:x) {
            System.out.printf("%s ",b);
        }
        System.out.println();
    }
}
