
import java.util.Scanner;

public class RotateMatrix90Degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of rows and columns
        System.out.println("Enter number of rows and columns in the array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        // Input: Matrix elements
        System.out.println("Enter elements in the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // Output: Rotated matrix
        System.out.println("Rotated matrix by 90 degrees clockwise:");
        rotateMatrix90Degrees(arr, rows, cols);
    }

    // Function to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrix90Degrees(int[][] arr, int rows, int cols) {
        // Create a new matrix to store the rotated values
        int[][] rotated = new int[cols][rows];

        // Fill the rotated matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotated[j][rows - 1 - i] = arr[i][j];
            }
        }

        // Print the rotated matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}

