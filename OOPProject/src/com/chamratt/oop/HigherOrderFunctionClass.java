package com.chamratt.oop;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class HigherOrderFunctionClass {
    public static void main(String[] args) {
        List<Person> people = List.of(
        new Person("Chamratt",Gender.MALE),
        new Person("Thyna",Gender.FEMALE),
        new Person("Chanta",Gender.FEMALE),
        new Person("Tola",Gender.MALE),
        new Person("Kimseak",Gender.FEMALE),
        new Person("Sotheavy",Gender.FEMALE),
        new Person("Sokha",Gender.MALE)
        );
        List<Person> females = new ArrayList<>();
        System.out.println("// Imperative approach");
        for (Person person : people){
            if(Gender.MALE.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female : females){
            System.out.println(female);
        }
        System.out.println("// Declarative approach");
        // Predicate Function
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        List<Person>females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
