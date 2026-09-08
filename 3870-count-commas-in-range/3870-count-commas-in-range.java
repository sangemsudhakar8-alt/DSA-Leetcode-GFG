class Solution {
    public int countCommas(int n) {
      int count =0;
        if(n>=1000){
            count +=(Math.min(n, 999999)-999);
        }
        if(n>=1000000){
            count +=(Math.min(n, 999999999) - 999999)*2;
        }
        if(n>=1000000000){
            count +=(n - 999999999)*3;
        }
        return count;
    }
}