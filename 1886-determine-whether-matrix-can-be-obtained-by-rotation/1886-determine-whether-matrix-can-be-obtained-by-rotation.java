class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n - 1;

            while (low < high) {
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
                low++;
                high--;
            }
        }

    }

    public boolean findRotation(int[][] mat, int[][] target) {
        if (mat.length != target.length) return false;

        if (Arrays.deepEquals(mat, target)) return true;

        for (int i = 0; i < 3; i++) {
            rotate(mat);
            if (Arrays.deepEquals(mat, target))
                return true;
        }
        return false;
    }
}