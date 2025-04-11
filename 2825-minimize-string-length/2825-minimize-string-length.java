class Solution {
    public int minimizedStringLength(String s) {
        // String str = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            } 
        }
        return hs.size();
    }
}