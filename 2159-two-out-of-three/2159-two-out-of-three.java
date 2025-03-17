class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1  = new HashSet<>();
        Set<Integer> set2  = new HashSet<>();
        Set<Integer> result  = new HashSet<>();

        for(int num:nums1) set1.add(num);

        for(int num:nums2){
            if(set1.contains(num)) result.add(num);
            set2.add(num);
        }

        for(int num:nums3) {
            if(set1.contains(num) || set2.contains(num)) result.add(num);
        }

        return new ArrayList<>(result);
    }
}