class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int bitcount[] = new int[32];
        for(int num:nums){
            for(int i=0;i<32;i++){
                if((num & (1<<i))!=0){
                    bitcount[i]++;
                }
            }
        }
    long totalsum =0;
    long MOD=1_000_000_007;
    for(int step =0;step<k;step++){
        long currentnum =0;
        for(int i=0;i<32;i++){
        if(bitcount[i]>0){
            currentnum |=(1L<<i);
            bitcount[i]--;
        }
    } 
    totalsum =(totalsum+(currentnum*currentnum)%MOD)%MOD; 
    }
     return (int)totalsum;
    }
}