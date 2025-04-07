class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        if(nums.length<=2) return -1;
        for(int i=1;i<=1;i++){
            count = nums[i];
        }
        return count;
    }
}