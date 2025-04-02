class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}