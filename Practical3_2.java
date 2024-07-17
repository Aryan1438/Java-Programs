
import static java.awt.PageAttributes.MediaType.C;

public class Practical3_2 {
    public static void main(String[] args) {
        
        System.out.println("");
        TriangleArea a = new TriangleArea();
        TriangleArea b = new TriangleArea(2);
        TriangleArea C = new TriangleArea(1,2);
        b.getdata();
        C.getdata();

    }
}
class TriangleArea
{
    TriangleArea()
    {
        
    }
    TriangleArea(double i)
    {
        double area = 3.14*i*i;
    }
    TriangleArea(double x , double y )
    {
        double area = x * y ;
    }
    void getdata()
    {
        System.out.println("Area is :" + b.area);
        System.out.println("Area is :" + C.area);
        System.out.println("Area is :" + a.x);
    }
}