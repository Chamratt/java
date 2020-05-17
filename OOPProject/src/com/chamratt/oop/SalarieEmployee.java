package com.chamratt.oop;

public class SalarieEmployee extends StaffMember {
    private double salary,bonus;

    public SalarieEmployee(double salary, double bonus,int id,String name,String address) {
        super(id, name, address);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "SalarieEmployee{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
