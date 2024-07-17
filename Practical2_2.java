public class Practical2_2
 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 9};
        int[] array2 = {1, 9, 9};
        int[] array3 = {1, 9, 9, 3, 9};

        System.out.println(array_count9(array1)); // Output: 1
        System.out.println(array_count9(array2)); // Output: 2
        System.out.println(array_count9(array3)); // Output: 3
        System.out.println("Aryan Patel 23cs057");
    }

    public static int array_count9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }
}