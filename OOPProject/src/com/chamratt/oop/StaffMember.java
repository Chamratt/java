package com.chamratt.oop;

public class StaffMember {
    private int id;
    private String name,address;
    private double pay;

    public StaffMember(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pay=" + pay +
                '}';
    }
}
