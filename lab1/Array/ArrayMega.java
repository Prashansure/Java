import java.util.Arrays;
import java.util.Scanner;

class ArrayMega 
{

    // Display array
    static void display(int[] a) {
        System.out.println("Array: " + Arrays.toString(a));
    }

    // Sum
    static int sum(int[] a) {
        int s = 0;

        for (int i = 0; i < a.length; i++) {
            s = s + a[i];
        }

        return s;
    }

    // Maximum
    static int maximum(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        return max;
    }

    // Minimum
    static int minimum(int[] a) {
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }

        return min;
    }

    // Search
    static boolean search(int[] a, int key) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return true;
        }

        return false;
    }

    public static void main(String args[]) {

        int[] numbers = {50, 20, 40, 10, 30};

        // 1. Display
        display(numbers);

        // 2. Access element
        System.out.println("First element = " + numbers[0]);
        System.out.println("Third element = " + numbers[2]);

        // 3. Length
        System.out.println("Length = " + numbers.length);

        // 4. Traversing
        System.out.println("Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 5. Sum
        System.out.println("Sum = " + sum(numbers));

        // 6. Average
        double average = (double) sum(numbers) / numbers.length;
        System.out.println("Average = " + average);

        // 7. Maximum
        System.out.println("Maximum = " + maximum(numbers));

        // 8. Minimum
        System.out.println("Minimum = " + minimum(numbers));

        // 9. Searching
        int key = 40;

        if (search(numbers, key))
            System.out.println(key + " found");
        else
            System.out.println(key + " not found");

        // 10. Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted = " + Arrays.toString(numbers));

        // 11. Binary Search
        int index = Arrays.binarySearch(numbers, 40);
        System.out.println("40 found at index = " + index);

        // 12. Copy Array
        int[] copy = Arrays.copyOf(numbers, 7);
        System.out.println("Copy = " + Arrays.toString(copy));

        // 13. Copy Range
        int[] range = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Range Copy = " + Arrays.toString(range));

        // 14. Fill
        int[] filled = new int[5];
        Arrays.fill(filled, 100);
        System.out.println("Filled = " + Arrays.toString(filled));

        // 15. Compare two arrays
        int[] b = {10, 20, 30, 40, 50};

        System.out.println("Arrays equal = "
                + Arrays.equals(numbers, b));
    }
}