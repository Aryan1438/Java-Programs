
import java.util.Scanner;

public class Practical3_3 {
    public static void main(String[] args) {
        System.out.println("Enter Employee data ");
        Employee a = new Employee();
        Employee b = new Employee();
        a.getdata();
        b.getdata();
        System.out.println();
        System.out.println("Employee yearly salary is "+a.getYearlySalary());
        System.out.println("After raising salary " + (a.getYearlySalary()*1.1));
        System.out.println("Employee yearly salary is "+b.getYearlySalary());
        System.out.println("After raising salary " + (b.getYearlySalary()*1.1));
        a.printdata();
        b.printdata();
    }
}
class Employee {

    String FirstName, LastName;
    double MonthlySalary;

    void setFirstName(String FirstName) {
        FirstName = "";
    }

    double setMonthlySalary(double MonthlySalary) {
        MonthlySalary = 0;
        return 0;
    }

    void setLastName(String LastName) {
        LastName = "";
    }

    void getdata() {

        Scanner sc = new Scanner(System.in);
        FirstName = sc.nextLine();
        LastName = sc.nextLine();
        MonthlySalary = sc.nextDouble();
        if(MonthlySalary <= 0)
        {
            MonthlySalary = 0;
        }

    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    public double getYearlySalary() {
        return MonthlySalary * 12;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    void printdata() {
        System.out.println("First name is " + FirstName);
        System.out.println("Last name is " + LastName);
        System.out.println("Employee Monthly salary is " + MonthlySalary);

    }

}
