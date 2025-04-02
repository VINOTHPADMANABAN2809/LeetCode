class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i]) && !l.contains(nums2[i])) l.add(nums2[i]);
        }
        int arr[] = new int[l.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = l.get(i);
        }
        return arr;
    }
    
}