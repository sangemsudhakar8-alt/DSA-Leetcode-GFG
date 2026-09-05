class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int rightmin[]=new int[n];
        rightmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightmin[i]=Math.min(nums[i],rightmin[i+1]);
        }
            int leftmax=nums[0];
            for(int i=0;i<n;i++){
                leftmax=Math.max(leftmax,nums[i]);
                int inst=leftmax-rightmin[i];
                if(inst<=k){
                    return i;
                }
            }  
        
     return -1;   
    }
    }
