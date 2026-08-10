class Solution {
    public String frequencySort(String s) {
         int freq[] = new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        StringBuilder result = new StringBuilder();
        for(int count=s.length();count>0;){
            int maxFreq=0;
            int maxChar=0;
            for(int i=0;i<128;i++){
                if(freq[i]>maxFreq){
                    maxFreq=freq[i];
                    maxChar=i;
                }
            }
        
        if(maxFreq == 0){
            break;
        }
        for(int i=0;i<maxFreq;i++){
            result.append((char)maxChar);
        }
        freq[maxChar] =0;
        count -=maxFreq;
        }
        return result.toString();
    }
}