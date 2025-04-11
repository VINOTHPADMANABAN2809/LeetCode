class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st = 0;
        int end = numbers.length-1;
        List<Integer> ls = new ArrayList<>();
        for(int i =0;i<numbers.length;i++){
            if(numbers[st]+numbers[end]==target) {
                ls.add(st+1);
                ls.add(end+1);
            }
            else if(numbers[st]+numbers[end]>target) end--;
            else if(numbers[st]+numbers[end]<target) st++;
        }
        int[] res = new int[2];
        for(int i=0;i<res.length;i++){
            res[i] = ls.get(i);
        }
        return res;
    }
}