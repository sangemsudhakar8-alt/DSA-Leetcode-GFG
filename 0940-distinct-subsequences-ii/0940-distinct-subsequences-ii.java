class Solution {
    public int distinctSubseqII(String s) {
        int mod=1_000_000_007;
        long dp=1;
        long last[]=new long[26];
        for(char c:s.toCharArray()){
            int idx=c-'a';
            long olddp=dp;
            dp=(2*dp-last[idx]+mod)%mod;
            last[idx]=olddp;
        }
    return (int) ((dp-1+mod)%mod);
    }
}