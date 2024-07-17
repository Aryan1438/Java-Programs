public class Practical2_3 {
    public static void main(String[] args) {
        System.out.println();
        int []arr1 = {1,2,3,4,9};
        int []arr2 = {9,3,4,5,0};
        System.out.println(array_front9(arr1));
        
        System.out.println(array_front9(arr2));
        System.out.println("Aryan Patel 23CS057");
        
    }
    public static boolean  array_front9(int [] nums)
    {
        for(int i=0;i<4;i++)
        {
            if(nums[i] == 9)
            {
                return true;
            }
            
        }
        return false;
    }
}
