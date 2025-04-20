class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        List<Integer> ls = new ArrayList<>(hs);
        int res[] = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            res[i] = ls.get(i);
        }
        Arrays.sort(res);
        int ans = 0;
        if(res.length>=3) ans =  res[res.length-3];
        else ans = res[res.length-1];
        return ans;
    }
}