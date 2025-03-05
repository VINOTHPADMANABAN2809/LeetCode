class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean pair = true;
        if(nums == null || nums.length<=1 || nums.length%2==1) pair = true;
        for(int i=0;i<nums.length-1;i++){
            
                if(nums[i]%2==nums[i+1]%2) pair = false;

            }
        return pair;
    }
}