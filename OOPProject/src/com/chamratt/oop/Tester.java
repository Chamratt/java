package com.chamratt.oop;

public class Tester {
    public static void main(String[] args) {
        Show b = new B();
        Show c = new C();

        A a = new A(c);
        a.display();

    }

}
interface  Show{
    public void display();
}
class A{
    Show s;
    public A(Show  s) {
        this.s = s;
    }
    public void display(){
        System.out.println("A");
      s.display();

    }
}
class B implements Show{
    public B() {
    }

    @Override
    public void display() {
        System.out.println("B");
    }
}
class C implements Show{
    public C() {
    }

    @Override
    public void display() {
        System.out.println("C");
    }
}
