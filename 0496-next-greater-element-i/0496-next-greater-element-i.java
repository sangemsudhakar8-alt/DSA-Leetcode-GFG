class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int target =nums1[i];
            int nextgreater=-1;
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j] == target){
                    found=true;
                }
                if(found && nums2[j]>target){
                    nextgreater=nums2[j];
                    break;
                }
            }
            ans[i] = nextgreater;
        }
    return ans;    
    }
}