class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l=new ArrayList<>();
        if(nums.length==1) l.add(String.valueOf(nums[0]));
        int t=0;
        for(int i=0;i<nums.length-1;i++){
            int temp=nums[i];
            int k=0;
            int j=i;
            while(j<nums.length-1 && nums[j]+1==nums[j+1]){
                k=nums[j+1];
                j++;
            }
            if(nums[i]+1!=nums[i+1]) k=temp;
            if(k==temp) l.add(String.valueOf(k));
            else{
                String st=String.valueOf(temp);
                st+="->";
                st+=String.valueOf(k);
                l.add(st);
            }
            i=j;
            t=i;
        }
        if(t==nums.length-2) l.add(String.valueOf(nums[nums.length-1]));
        return l;
    }
}