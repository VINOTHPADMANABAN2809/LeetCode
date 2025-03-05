class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int cols = mat[0].length;

        int sum = 0;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(i+j == row-1 || i==j){
                    sum += mat[i][j];
                }
            }
        }

        
        return sum;
    }
}