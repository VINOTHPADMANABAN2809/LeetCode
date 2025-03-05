class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int row = mat.length;
        int cols = mat[0].length;

        if(row*cols!=r*c){
            return mat;
            }
        

        int matrix_reshape[][] = new int[r][c];
        for(int i=0;i<row*cols;i++){
            
            int old_row = i / cols;
            int old_cols = i % cols;

            int new_row = i / c;
            int new_cols = i % c;

            matrix_reshape[new_row][new_cols] = mat[old_row][old_cols];
            }
        
        return matrix_reshape;

    }
}
