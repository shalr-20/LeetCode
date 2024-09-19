class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transposing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                /*
                 * j ranges from 0 to n/2 (which is 0 to 1 for a 3x3 matrix),
                 * as we only need to swap elements up to the midpoint of the row.
                 */
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}