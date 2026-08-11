class Solution {
    public String longestPalindrome(String s) {
     int low=0;
     int high=0;
     for(int i=0;i<s.length();i++){
        int max1=display(s,i,i);
        int max2=display(s,i,i+1);
        int max=Math.max(max1,max2);
        if(max>high-low+1){
            low = i-(max-1)/2;
            high=i+max/2;
        }
       
    }  
      return s.substring(low,high+1);   
    }
     private static int display(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
     }
}