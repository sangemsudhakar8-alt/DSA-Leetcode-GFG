class Solution {
    public long[] resultArray(int[] nums, int k) {
        long ans[] = new long[k];
        long dp[] = new long[k];
        for(int num:nums){
            long nextdp[] = new long[k];
            int val = num%k;
            nextdp[val]++;
            for(int r=0;r<k;r++){
                if(dp[r]>0){
                    int nextrem =(r*val)%k;
                    nextdp[nextrem] +=dp[r];
                }
            }
            dp = nextdp;
            for(int r=0;r<k;r++){
                ans[r] +=dp[r];
            }
        }
    return ans;  
    }
}