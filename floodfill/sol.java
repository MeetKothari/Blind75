class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor != newColor) {
            fill(image, sr, sc, oldColor, newColor);
        }
        return image;
    }

    private void fill(int[][] image, int row, int col, int oldColor, int newColor) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != oldColor) {
            return;
        }

        image[row][col] = newColor;

        fill(image, row-1, col, oldColor, newColor);
        fill(image, row+1, col, oldColor, newColor);
        fill(image, row, col-1, oldColor, newColor);
        fill(image, row, col+1, oldColor, newColor);
    }
}
