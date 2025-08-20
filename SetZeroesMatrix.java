public class SetZeroesMatrix{
    public static void main(String[] args) {
        int[][] mat = { {1, 2, 12}, {4, 0, 5}, {2, 8, 15} };
        setZeroes(mat);
        // Print result
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
         } }
    static void setZeroes(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        boolean[] row = new boolean[r], col = new boolean[c];
         // Mark the rows and columns that have 0
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (mat[i][j] == 0)
                    row[i] = col[j] = true;
         // Set rows to 0
        for (int i = 0; i < r; i++)
            if (row[i])
                for (int j = 0; j < c; j++)
                    mat[i][j] = 0;
        // Set columns to 0
        for (int j = 0; j < c; j++)
            if (col[j])
                for (int i = 0; i < r; i++)
                    mat[i][j] = 0;
    }}
