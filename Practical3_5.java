
public class Practical3_5 {
    public static void main(String[] args) {
        Area a = new Area(1, 2);
        a.returnArea();
    }
}
class Area
{
    int Length , Breadth ;
    
    Area(int length,int breadth)
    {
        Length = length;
        Breadth = breadth;
    }
    void returnArea()
    {
        System.out.println("Are of rectengle is" + (Length*Breadth));
    }
}