class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int btm = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        List<Integer> res = new ArrayList<>();

        while(top<=btm && left<=right){
            for(int i=top;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=btm;i++){
                res.add(matrix[i][right]);
            }
            right--;

            for(int i=right;i>=left;i--){
                if(top<=btm) res.add(matrix[btm][i]);
            }
            btm--;

            for(int i=btm;i>=top;i--){
                if(left<=right) res.add(matrix[i][left]);
                
            }
            left++;
            
        }
        return res;
    }
}