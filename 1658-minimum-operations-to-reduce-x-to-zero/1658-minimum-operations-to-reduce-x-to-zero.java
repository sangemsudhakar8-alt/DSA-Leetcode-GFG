class Solution {
    public int minOperations(int[] nums, int x) {
        int totalsum =0;
        for(int num:nums){
            totalsum += num;
        }
        int target = totalsum-x;
        if(target==0){
            return nums.length;
        }
        if(target<0){
            return -1;
        }
        int left =0;
        int currentsum =0;
        int maxlength=-1;
        for(int right =0;right<nums.length;right++){
            currentsum +=nums[right];
           while(currentsum>target && left<=right){
            currentsum -=nums[left];
            left++;
           }
           if(currentsum ==target){
            maxlength =Math.max(maxlength,right-left+1);
           }
        }
    return maxlength ==-1 ?-1:nums.length-maxlength;   
    }
}