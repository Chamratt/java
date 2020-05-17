package com.chamratt.oop;

public class Print {
    Print(String smg){
        System.out.println(smg);
    }
}
interface PrintF{
    void scan();
}
class PrintG extends Print implements PrintF{

    PrintG(String smg) {
        super(smg);
    }
  public   void scan(){
      PrintG printG = null;
      printG.scan();
    }
}
abstract class Bike{
    abstract void run();
}
class Honda extends Bike{

    @Override
    void run() {
        System.out.println("Honda is running");
    }
}
class Lambugini extends Bike{

    @Override
    void run() {
        System.out.println("Lambugini is running");
    }
}
class Test{
    private static Object PrintF;

    public static void main(String[] args) {
       // new Print("Hello World");
       // PrintF = new PrintG("Hello world");
       // PrintG printG = new PrintG("Hello");
        Bike b;
        b = new Honda();
      //  b.run();
        b = new Lambugini();
        b.run();



    }
}
