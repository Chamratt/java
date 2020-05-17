import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;
public class SumBinary {
        public static void main(String[] args)
        {
//            long binary1, binary2,binary3;
//            int i = 0, remainder = 0;
//            int[] sum = new int[20];
//            Scanner in = new Scanner(System.in);
//
//            System.out.print("Input first binary number: ");
//            binary1 = in.nextLong();
//            System.out.print("Input second binary number: ");
//            binary2 = in.nextLong();
//            System.out.print("Input third binary number: ");
//            binary3 = in.nextLong();
//            while (binary1 != 0 || binary2 != 0 || binary3 != 0)
//            {
//                sum[i++] = (int)((binary1 % 10 + binary2 % 10 + binary3 % 10 + remainder) % 2);
//                remainder = (int)((binary1 % 10 + binary2 % 10 + binary3 % 10 + remainder) / 3);
//                binary1 = binary1 / 10;
//                binary2 = binary2 / 10;
//                binary3 = binary3 / 10;
//            }
//            if (remainder != 0) {
//                sum[i++] = remainder;
//            }
//            --i;
//            System.out.print("Sum of two binary numbers: ");
//            while (i >= 0) {
//                System.out.print(sum[i--]);
//            }
//            System.out.print("\n");
            Console console;
            if((console = System.console())!=null)
            {
                char[] password = null;
                try {
                    password = console.readPassword("Input your password: ");
                    System.out.println("Your password was: " + new String(password));
                }finally {
                    if(password != null){
                        Arrays.fill(password,' ');
                    }
                }
            }else {
                throw  new RuntimeException("Can't get password.....");
            }

        }
    }


