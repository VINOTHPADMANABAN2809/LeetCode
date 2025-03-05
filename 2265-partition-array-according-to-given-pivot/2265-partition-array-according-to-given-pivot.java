class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        if (nums.length == 1) {
            return nums;

        }
        List<Integer> less = new ArrayList<>(),
                equal = new ArrayList<>(),
                high = new ArrayList<>();

        for (int i : nums) {
            if (i < pivot)
                less.add(i);
            else if (i > pivot)
                high.add(i);
            else
                equal.add(i);
        }
        int idx = 0;
        for (int i : less)
            nums[idx++] = i;
        for (int i : equal)
            nums[idx++] = i;
        for (int i : high)
            nums[idx++] = i;

        return nums;
    }
}