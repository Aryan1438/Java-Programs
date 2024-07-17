import java.util.Scanner;

public class Practical1_6 {
    public static void main(String[] args) {
        System.out.println("Write a program in Java to reverse the digits of a number using while loop.");

         ;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter num to do reverse");
        int number = x.nextInt();int reverse = 0;

        while(number != 0 )
        {
            int reminder = number%10;
            

            reverse = (reverse * 10 + reminder);
            number /= 10 ; 

        }
        System.out.println(reverse);
        System.out.println("Aryan Patel 23CS057");
    }
}
