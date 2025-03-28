class Solution {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        String a = str[str.length-1];

        return a.length();
    }
}