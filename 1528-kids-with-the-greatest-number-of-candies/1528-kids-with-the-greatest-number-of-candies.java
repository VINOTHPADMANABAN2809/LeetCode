class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max) max = candies[i];
        }
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int ex = candies[i] + extraCandies;
            if(ex < max) list.add(false);
            else list.add(true);
        }
        return list;
    }
}