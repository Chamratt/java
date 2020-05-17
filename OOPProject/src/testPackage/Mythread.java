package testPackage;

public class Mythread extends Thread {
    String message;
    int sleepPermilli;

    public Mythread(String message, int sleepPermilli) {
        this.message = message;
        this.sleepPermilli = sleepPermilli;
    }
    public void run(){
        try {
            for (int i = 0 ; i < message.length(); i++){
                System.out.print(message.charAt(i));
                Thread.sleep(sleepPermilli);
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
