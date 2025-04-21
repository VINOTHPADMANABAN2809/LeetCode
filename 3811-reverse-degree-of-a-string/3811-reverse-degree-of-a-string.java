class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i=1;i<=s.length();i++){
            int digit =   26 - (s.charAt(i-1)-'a');
            ans += i*digit; 
        } 
        return ans;
    }
}