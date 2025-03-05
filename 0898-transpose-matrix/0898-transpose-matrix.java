class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int cols = matrix[0].length;
        

        int transpose[][] = new int[cols][row];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}