public class Practical2_5
{
    public static void main(String[] args) {
        String x= "To be or not to be” would become ";
        System.out.println(Reverse(x));
    }
    public static String Reverse (String x)
    {
        String Word[] = x.split(" ");
        StringBuilder result = new StringBuilder();
        for(String a : Word)
        {
            StringBuilder abc = new StringBuilder(a);
            result.append(abc.reverse().toString()).append(" ");      
        }

        return result.toString().trim();
        
    }
}