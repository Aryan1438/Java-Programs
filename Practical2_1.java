public class Practical2_1{
    public static void main(String[] args) {
        String[]arr={"hiii", "Aryan", "banti"};
        int n=3;
        for(String abc : arr)
        {
            String a =  frontTimes(abc, n);
            System.out.println(abc +"   " +  a);
        }
        System.out.println("Aryan Patel 23cs057");
        
    }
    public static String frontTimes(String abc, int n )
    {
        
        String x;
        if(abc.length()<3)
        {
            x=abc;
        }
        else{
            x=abc.substring(0,3);
        }
        StringBuilder A = new StringBuilder();
        for(int i=0;i<3;i++){
            A.append(x);
        }

        
        return A.toString();
        
    }
}