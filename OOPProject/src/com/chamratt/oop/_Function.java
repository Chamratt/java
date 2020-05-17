package com.chamratt.oop;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment;
        increment = incrementByOneFucntion.apply(1);
        System.out.println(increment);

        int mutiplyBy10;
        mutiplyBy10 = multiplyBy10Function.apply(1);
        System.out.println(mutiplyBy10);

//        int addByOneAndMutiplyBy10;
//        addByOneAndMutiplyBy10 = addBy1AndMutiplyBy10.apply(4);
//        System.out.println(addByOneAndMutiplyBy10);
         Function<Integer,Integer> addBy1AndMutiplyBy10 =
                incrementByOneFucntion.andThen(multiplyBy10Function);
        System.out.println(addBy1AndMutiplyBy10.apply(4));
    }
    static Function<Integer,Integer> incrementByOneFucntion =
            number -> number+1;
    static Function<Integer,Integer> multiplyBy10Function =
            number -> number *10;

}
