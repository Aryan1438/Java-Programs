
import java.util.Scanner;


public class Practical3_4 {
    public static void main(String[] args) {
        Date a = new Date();
        a.displayDate();
    }
}
class Date
{
    int Date,Month,Year;
    Date()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date");
        Date = sc.nextInt();
        System.out.println("Enter  month");
        Month = sc.nextInt();
        System.out.println("Enter  year");
        Year = sc.nextInt();
        


    }
    void displayDate()
    {
        System.out.println("Date is :");
        System.out.println(Date + "/" + Month + "/" + Year);
    }
}
