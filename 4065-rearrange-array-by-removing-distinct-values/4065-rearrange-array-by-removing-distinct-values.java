class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int count[] = new int[101];
        int maxfreq =0;
        for(int num:nums){
            count[num]++;
            if(count[num]>maxfreq){
                maxfreq = count[num];
            }
        }
        int ans[] = new int[nums.length];
        int index=0;
        for(int round =0;round<maxfreq;round++){
            for(int i=1;i<=100;i++){
                if(count[i]>0){
                    ans[index++]=i;
                    count[i]--;
                }
            }
        }
        return ans;
    }
}