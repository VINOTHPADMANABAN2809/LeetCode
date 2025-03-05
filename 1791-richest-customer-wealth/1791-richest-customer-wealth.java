class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int total_sum = 0;
        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += accounts[i][j];
            }
            if(sum>0 && sum>total_sum){
                total_sum = sum;
            }

        }
        return total_sum;
    }
}