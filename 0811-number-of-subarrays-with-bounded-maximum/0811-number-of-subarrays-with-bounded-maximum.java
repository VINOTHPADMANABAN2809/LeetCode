class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int i ,count = 0;
        int start = -1 , end = -1;
        for(i=0;i<nums.length;i++){
            if(nums[i]> right){
                start = i;
            }
            if(nums[i]>=left){
                end = i;
            }
            count = count+(end-start);
        }
        return count;
    }
}