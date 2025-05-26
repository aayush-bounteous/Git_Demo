public class basic {
    public static void main(String[] args) {
        int[] numbers = { 23, 56, 92, 39, 15 }; // Sample array

        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) { // Check if number is even
                System.out.println(num);
            }
        }

        System.out.println("Odd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) { // Check if number is odd
                System.out.println(num);
            }
        }
    }
}
