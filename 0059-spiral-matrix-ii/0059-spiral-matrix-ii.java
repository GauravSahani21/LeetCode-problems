class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];

        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = n - 1;

        int num = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num;
                num++;
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                matrix[j][right] = num;
                num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i]= num;
                    num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                   matrix[j][left] = num;
                   num++;
                }
                left++;
            }
        }
        return matrix;
    }
}