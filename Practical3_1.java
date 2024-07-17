import java.util.Scanner;

public class Practical3_1 {
    public static void main(String[] args) {
        System.out.println("Enter pound value :");
        Scanner sc = new Scanner(System.in);
        int pound = sc.nextInt();
        int inr = pound*100;
        System.out.println("Value of pound in indian ruppe is :" + inr);

        sc.close();

    }
}
