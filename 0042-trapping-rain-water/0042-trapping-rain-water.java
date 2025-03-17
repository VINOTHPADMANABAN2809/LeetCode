class Solution {
    public int trap(int[] height) {
       
        int n = height.length;
        int lb = 0;
        int rb = n-1;
        int lhb = height[lb];
        int rhb = height[rb];
        int res = 0;

        while(lb<=rb){
            if(lhb<=rhb){
                if(height[lb]>lhb){
                    lhb = height[lb];
                }
                else{
                    res = res + lhb - height[lb];
                    
                }
                lb++;
            }
            else{
                if(height[rb]>rhb){
                    rhb = height[rb];
                }
                else{
                    res = res + rhb - height[rb];
                    
                }
                rb--;
                
                }
            }

        return res;
    
        
    }
}
    
