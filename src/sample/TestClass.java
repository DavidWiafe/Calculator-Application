package sample;
import java.util.Scanner;


public class TestClass {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

         System.out.println("Type a number");

         int stringNum1 = scan.nextInt();

         System.out.println("Here is your number "+stringNum1);

         System.out.println("Type other number");

        int stringNum2 = scan.nextInt();

        System.out.println("Here is your number "+stringNum2);

        for(int loop = 0; loop < 5; loop++){



        }
        int a = stringNum1+stringNum2;
        System.out.println("When Added = "+a);


    }


}
