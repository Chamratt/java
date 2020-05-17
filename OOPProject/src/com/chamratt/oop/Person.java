package com.chamratt.oop;

import java.util.Objects;

public class Person {
    public static void main(String[] args) {
        System.out.println(new Chamratt("homer",23,1.60).equals(new Chamratt("homer",23,1.60)));
    }
    static class Chamratt{
        private String name;
        private int age;
        private double height;

        public Chamratt(String name, int age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Chamratt)) return false;
            Chamratt chamratt = (Chamratt) o;
            return age == chamratt.age &&
                    Double.compare(chamratt.height, height) == 0 &&
                    Objects.equals(name, chamratt.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, height);
        }
    }
}
