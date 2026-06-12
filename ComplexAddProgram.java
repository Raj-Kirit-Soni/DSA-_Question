import java.util.Scanner;

class Adder {
    // Method overloading for different data types
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int[] numbers) {
        return addRecursive(numbers, numbers.length);
    }

    // Recursive helper method to sum array elements
    private int addRecursive(int[] numbers, int n) {
        if (n <= 0) return 0;
        return addRecursive(numbers, n - 1) + numbers[n - 1];
    }
}

public class ComplexAddProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adder adder = new Adder();

        // Integer addition
        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of integers: " + adder.add(x, y));

        // Double addition
        System.out.print("Enter two decimal numbers: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Sum of doubles: " + adder.add(d1, d2));

        // Array addition
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of array elements: " + adder.add(arr));

        sc.close();
    }
}
