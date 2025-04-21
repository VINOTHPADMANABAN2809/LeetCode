class Solution {
    public int addDigits(int num) {
        if(num == 0 || num<=9) return num;
        int sum = 1+(num-1)%9;
        return sum;
    }
}