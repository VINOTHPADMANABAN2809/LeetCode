class Solution {
    public String convertDateToBinary(String date) {
        
        
        StringBuilder s = new StringBuilder();
        s.append(Integer.toBinaryString(Integer.parseInt(date.substring(0,4))));
        s.append("-");
        s.append(Integer.toBinaryString(Integer.parseInt(date.substring(5,7))));
        s.append("-");
        s.append(Integer.toBinaryString(Integer.parseInt(date.substring(8,date.length()))));
        return s.toString();

    }
}