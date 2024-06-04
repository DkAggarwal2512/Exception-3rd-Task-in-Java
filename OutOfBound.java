import java.util.Scanner;

public class OutOfBound {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {1,2,3,4,5,6};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter an index
            System.out.print("Enter an index to access the array: ");
            int index = scanner.nextInt();

            // Access and print the element at the specified index
            System.out.println("Element at index " + index + " is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception if the index is out of bounds
            System.out.println("Error: Index out of bounds. Please enter a valid index between 0 and " + (numbers.length - 1) + ".");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
