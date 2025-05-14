package Colleg_Problems;

public class PascalsTriangle {
     // Function to print Pascal's Triangle up to 'n' rows
     public static void printPascal(int n) {
        for (int line = 0; line < n; line++) { // Iterate over rows
            int num = 1; // First element in each row is always 1
            for (int i = 0; i <= line; i++) { // Iterate over columns
                System.out.print(num + " "); // Print the current number
                
                // Compute the next number in the row using:
                // num = num * (line - i) / (i + 1)
                num = num * (line - i) / (i + 1);
            }
            System.out.println(); // Move to the next row
        }
    }

    // Main function to execute the program
    public static void main(String[] args) {
        int n = 5; // Number of rows
        printPascal(n); // Call the function to print Pascal's Triangle
    }
}
