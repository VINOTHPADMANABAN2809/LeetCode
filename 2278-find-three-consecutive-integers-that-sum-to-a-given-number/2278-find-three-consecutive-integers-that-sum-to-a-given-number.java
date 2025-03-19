class Solution {
    public long[] sumOfThree(long num) {
        long res = num/3;
        if(num%3!=0) return new long[0];
        long arr[] = new long[3];
        arr[0] = res-1;
        arr[1] = res;
        arr[2] = res+1;
        return arr;
    }
}