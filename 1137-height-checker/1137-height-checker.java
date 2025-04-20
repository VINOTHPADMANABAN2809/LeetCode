class Solution {
    public int heightChecker(int[] heights) {
        int[] res = new int[heights.length];
        for(int i=0;i<res.length;i++){
            res[i] = heights[i];
        }
        Arrays.sort(res);
        int count = 0;
        for(int i=0;i<res.length;i++){
            if(res[i]!=heights[i]) count++;
        }
        return count;

    }
}