class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int a = numBottles;
        
        while(a>=numExchange){
            int c  = a/numExchange;
            sum += c;
            a = a%numExchange + c;
        }
        
       
        return sum;
    }
}