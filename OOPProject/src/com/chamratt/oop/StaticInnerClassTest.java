package com.chamratt.oop;

public class StaticInnerClassTest {
    static class ArrayAlg
    {
        public static class Pair
        {
            private double first;
            private double second;

            public Pair(double first, double second) {
                this.first = first;
                this.second = second;
            }

            public double getFirst() {
                return first;
            }

            public void setFirst(double first) {
                this.first = first;
            }

            public double getSecond() {
                return second;
            }

            public void setSecond(double second) {
                this.second = second;
            }
        }
        public static Pair minimax(double[] values)
        {
            double min = Double.MIN_VALUE;
            double max = Double.MAX_VALUE;
            for (double v: values) {
                if(min > v) min = v;
                if (max < v) max = v;
            }
            return new Pair(min,max);
        }
    }
    public static void main(String[] args) {
        double [] d = new double[20];
        for (int i = 0; i < d.length; i++){
            d[i] = 100 * Math.random();
            ArrayAlg.Pair p = ArrayAlg.minimax(d);
            System.out.println("min = " + p.getFirst());
            System.out.println("max = " + p.getSecond());
        }
    }
}

