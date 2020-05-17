package chamratt.java.direction;

public class Test implements Runnable {

    public void run(){

        for (int i = 1; i<= 5;i++){
            System.out.println("This is message # "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception ex){
                System.out.println("I about to stop");
            }

        }
    }

    public static void main(String[] args) {
       Thread t1 = new Thread(new Test());
       t1.start();
       try {
          t1.join();
       }catch (InterruptedException ex){
           System.out.println(ex.getMessage());
       }
        System.out.println("Completed");
    }
}
