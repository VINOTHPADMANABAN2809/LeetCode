class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(String j:str){
            i = (int ) (j.charAt(j.length()-1)-'0');
            res[i-1] = j.substring(0,j.length()-1);
        }

        for(i = 0;i<res.length-1;i++){
            sb.append(res[i]).append(" ");
        
        }
        sb.append(res[i]);
        return sb.toString();
    }
}