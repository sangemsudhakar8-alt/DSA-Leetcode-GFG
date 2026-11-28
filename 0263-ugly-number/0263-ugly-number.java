class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        int[] fact ={2,3,5};
        for(int factor:fact){
            while(n%factor==0){
                n/=factor;
            }
        }
     return n==1;   
    }
}