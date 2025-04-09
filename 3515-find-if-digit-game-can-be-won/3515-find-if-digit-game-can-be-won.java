class Solution {
    public boolean canAliceWin(int[] nums) {
        int one_digit = 0;
        int double_digit = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10) one_digit+=nums[i];
            else if(nums[i]>=10 && nums[i]<=99) double_digit += nums[i];
        }
        if(one_digit==double_digit) return false;
        return true;
    }
}