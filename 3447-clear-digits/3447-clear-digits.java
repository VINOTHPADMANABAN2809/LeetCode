class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(char n : s.toCharArray()){
            if(Character.isDigit(n)){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
            
                }
            }
            else{
                sb.append(n);
            }
            
        }
        return sb.toString();
    }
}