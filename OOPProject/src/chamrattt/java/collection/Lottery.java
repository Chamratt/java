package chamrattt.java.collection;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number you need to draw? ");
        int k = scanner.nextInt();

        System.out.println("highest number you can draw? ");
        int n = scanner.nextInt();

        int [] number = new int[k];
        for (int i = 0; i < number.length; i++)
            number[i] = i + 1;

        int [] result = new int[n];
        for (int i = 0; i < result.length; i++)
        {
            int r = (int) (Math.random() * n);
            result[i] = number[i];

            number[r] = number[n - 1];
            n--;
        }
       // Arrays.sort(result);
        for (int r: result) {
            System.out.print(r+" ");
        }
    }
}
