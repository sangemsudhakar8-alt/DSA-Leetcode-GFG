class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength =0;
        int last[] = new int[128];
        for(int right =0,left=0;right<s.length();right++){
            char current = s.charAt(right);
            left = Math.max(left,last[current]);
            maxlength = Math.max(maxlength,right-left+1);
            last[current] = right+1;
        }
    return maxlength;   
    }
}