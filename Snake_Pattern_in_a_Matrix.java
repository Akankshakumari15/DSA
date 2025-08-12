import java.util.Scanner;
public class Snake_Pattern_in_a_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of rows and columns
        System.out.println("Enter number of rows and columns in the matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input: Matrix elements
        System.out.println("Enter elements in the 2D matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

       System.out.println("Snake Pattern: ");
       for (int i = 0; i < rows; i++) {
             if (i % 2 == 0) {
        // Even-indexed rows (0, 2, 4...): left to right
                 for (int j = 0; j < cols; j++) {
            System.out.print(matrix[i][j] + " ");
              }
            } else {
        // Odd-indexed rows (1, 3, 5...): right to left
                 for (int j = cols - 1; j >= 0; j--) {
            System.out.print(matrix[i][j] + " ");
        }
      }
    }
  }
}
