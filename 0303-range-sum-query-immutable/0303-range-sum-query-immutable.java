class NumArray {
    public int pref[] ;
        

    public NumArray(int[] nums) {
        
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        this.pref = nums;

    }
    
    public int sumRange(int left, int right) {
        
        int res = 0;
       if(left==0) res = pref[right];
       else res = pref[right]-pref[left-1];
       return res;
        
                

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */