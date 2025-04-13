class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap <Integer, Integer> HM = new HashMap<>();
        for(int num : nums){
            HM.put(num, HM.getOrDefault(num,0)+1);
        }
        int ans []= new int[2];
        int l=0;
        for(int k : HM.keySet()){
            if(HM.get(k)==2){
                ans[l]=k;
                l++;
            }
            if(l==2) break;
        }
        return ans;
    }
}