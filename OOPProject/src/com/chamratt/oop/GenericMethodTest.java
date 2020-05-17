package com.chamratt.oop;

public class GenericMethodTest {
    public static <C> void printArray(C[] inputArray){
        for (C cd : inputArray){
            System.out.printf("%s ", cd);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Double[] doublesArray = {1.1,2.2,3.3,4.4};
        printArray(doublesArray);

    }
}
