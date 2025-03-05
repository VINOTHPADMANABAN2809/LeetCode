class Solution {
    public String getHappyString(int n, int k) {
        List<String> ls = new ArrayList<>();
        backtrack("",n,ls);
        Collections.sort(ls);
        return k<= ls.size()?ls.get(k-1):"";
    }
    public void backtrack(String current,int N,List<String> ls){
        if(current.length()==N){
            ls.add(current);
            return;
        }
        char[] ch ={'a','b','c'};
        for(char c:ch){
            if(current.length()==0||current.charAt(current.length()-1)!=c){
                backtrack(current+c,N,ls);
            }
        }
    }
}