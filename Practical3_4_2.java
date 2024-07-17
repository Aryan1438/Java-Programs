
public class Practical3_4_2 {
    public static void main(String[] args) {
        Date a = new Date(1, 2, 2000);
        a.displayDate();
    }
}
class Date
{
    int Date,Month,Year;
    Date(int date, int month , int year )
    {
        Date=date;
        Month=month;
        Year=year;
    }
    void displayDate()
    {
        System.out.println("Date is ");
        System.out.println(Date + "/" + Month + "/" + Year);
    }
}
