class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i]*nums[i];
        }
        // int max = arr[0];
        // for(int i=0;i<arr.length;i++){

        // }
        Arrays.sort(arr);
        return arr;
    }
}