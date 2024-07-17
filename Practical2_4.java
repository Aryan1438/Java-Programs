public class Practical2_4 {
    public static void main(String[] args) {
        System.out.println(double_char("HI"));
        System.out.println(double_char("ARYAN"));
    }
    public static String double_char(String str)
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<str.length();i++)
        {
            char x = str.charAt(i);
            result.append(x).append(x);
        }
        return result.toString();
        
    }
}
