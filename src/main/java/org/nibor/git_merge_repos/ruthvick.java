public class ruthvick {

    // Function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Function to print an array of integers
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(5, 10));
        System.out.println("Is 7 even? " + isEven(7));
        System.out.println("Reverse 'Hello': " + reverseString("Hello"));

        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);
    }
}
