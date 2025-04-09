class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean isdecrease = true;
        boolean isincrease = true;
        for(int i=1;i<nums.length;i++){
            if(!isdecrease && !isincrease) return false;
            if(nums[i-1]>nums[i]) isincrease = false;
            else if(nums[i-1]<nums[i]) isdecrease = false;
            
        }
        if(isdecrease || isincrease) return true;
        else return false;
        
    }
}