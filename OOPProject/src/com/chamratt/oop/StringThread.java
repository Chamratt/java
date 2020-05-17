package com.chamratt.oop;

public class StringThread extends Thread {
    public static void main(String[] args) {
        StringThread stringThread = new StringThread();
        stringThread.start();
        try {
        String display = "HELLO ANT TECHNOLOGY!\n"+
                         "*************************\n"+
                         "I try my best to be here\n"+
                         "---------------------------\n";
        printThread(display,350);
        String messDownload = "Downloading";
        printThread(messDownload,10);
        String waiting=".........";
        printThread(waiting,350);
        String complete = "Complete 100%";
        printThread(complete,10);
            stringThread.join();
        }catch (Exception ex){}
    }
    public static void printThread(String message, long miiliPerChar){
        for (int i = 0;i< message.length();i++){
            System.out.print(message.charAt(i));

            try {
                Thread.sleep(miiliPerChar);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
