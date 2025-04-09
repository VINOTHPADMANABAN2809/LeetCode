class Solution {
    public String truncateSentence(String s, int k) {
        
        if(s.length()==k) return s;
        String[] str = s.split(" ");
        String res="";
        for(int i=0;i<k;i++){
            res=String.join(" ",res,str[i]);
        }

        //String vk = String.valueOf(res);
        return res.trim();
    }
}