class Solution {
    public int minInsertions(String s) {
        int insertions =0;
        int opencount =0;
        int i=0;
        int n = s.length();
        while(i<n){
            char c = s.charAt(i);
            if(c=='('){
                opencount++;
                i++;
            }else{
                if(i+1<n&&s.charAt(i+1)==')'){
                    i+=2;
                }else{
                    insertions++;
                    i++;
                }
                if(opencount>0){
                    opencount--;
                }else{
                    insertions++;
                }
            }
        }
    insertions +=opencount*2;
    return insertions;  
    }
}