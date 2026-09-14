class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int[] ans = new int[rows * cols];

        int r = 0;
        int c = 0;

        for (int i = 0; i < rows * cols; i++) {

            ans[i] = mat[r][c];

            if ((r + c) % 2 == 0) {

                // Moving UP-RIGHT
                if (c == cols - 1) {
                    r++;
                }
                else if (r == 0) {
                    c++;
                }
                else {
                    r--;
                    c++;
                }

            } else {

                // Moving DOWN-LEFT
                if (r == rows - 1) {
                    c++;
                }
                else if (c == 0) {
                    r++;
                }
                else {
                    r++;
                    c--;
                }
            }
        }

        return ans;
    }
}