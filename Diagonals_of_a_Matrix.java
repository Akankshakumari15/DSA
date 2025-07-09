import java.util.Scanner;

public class Diagonals_of_a_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Input: Number of rows and columns
        System.out.println("Enter number of rows and columns in the matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        // Check if the matrix is square
        if (rows != cols) {
            System.out.println("Error: The matrix must be a square matrix.");
            sc.close();
            return;
        }
        int[][] matrix = new int[rows][cols];
        // Input: Matrix elements
        System.out.println("Enter elements in the 2D matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        // Output: Diagonal elements
        System.out.println("Primary Diagonal elements:");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println("\nSecondary Diagonal elements:");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][rows - 1 - i] + " ");
        }
    }
}


