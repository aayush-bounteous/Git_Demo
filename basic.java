public class basic {
    public static void main(String[] args) {
        int[] numbers = { 23, 56, 92, 39, 15 }; // Sample array

        int evenPrimeCount = 0;
        int oddPrimeCount = 0;

        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
                if (isPrime(num)) {
                    evenPrimeCount++;
                }
            }
        }

        System.out.println("Odd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
                if (isPrime(num)) {
                    oddPrimeCount++;
                }
            }
        }

        System.out.println("\nNumber of prime numbers in even list: " + evenPrimeCount);
        System.out.println("Number of prime numbers in odd list: " + oddPrimeCount);
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
