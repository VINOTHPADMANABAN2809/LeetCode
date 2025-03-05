class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left = 0;
        int right = n;
        int arr[] = new int[2*n];
        for(int i=0;i<(2*n);i=i+2){
            arr[i]=(nums[left]);
            left++;
        }
        for(int i=1;i<(2*n);i=i+2){
            arr[i]=(nums[right]);
            right++;
        }

        return arr;
            
        
    }
}