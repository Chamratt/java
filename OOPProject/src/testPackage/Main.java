package testPackage;

public class Main {
    public static void main(String[] args) {
        Mythread mythread1 = new Mythread("Hello KSHRD!\n" +
                "******************************\n"+
                "I will try my best to be here \n"+
                "------------------------------\n",350);

        Mythread mythread2 = new Mythread("Downloading",0);
        Mythread mythread3 = new Mythread("........",400);
        Mythread mythread4 = new Mythread("Complete 100%!",0);







        mythread1.start();
        try {
            mythread1.join();
        }catch (Exception e){}
        mythread2.start();
        try {
            mythread2.join();
        }catch (Exception e){}
        mythread3.start();
        try {
            mythread3.join();
        }catch (Exception e){}
        mythread4.start();
        try {
            mythread4.join();
        }catch (Exception e){}
    }
}
