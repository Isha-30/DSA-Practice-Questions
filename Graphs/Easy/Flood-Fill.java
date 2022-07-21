class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)
            return image;
        int rows = image.length;
        int col = image[0].length;
        helper(image, sr, sc, image[sr][sc], newColor, rows, col);
        return image;
    }
    private void helper(int[][] image, int sr, int sc, int oldColor, int newColor, int r, int c){
        if(sr<0 || sr>=r || sc<0 || sc >= c || image[sr][sc] != oldColor)
            return;
        
        image[sr][sc] = newColor;
        helper(image, sr+1, sc, oldColor, newColor, r, c);
        helper(image, sr, sc+1, oldColor, newColor, r, c);
        helper(image, sr-1, sc, oldColor, newColor, r, c);
        helper(image, sr, sc-1, oldColor, newColor, r, c);
    }
}
