class Solution {
    public int sumSubarrayMins(int[] arr) {
    
        int n = arr.length;
        int MOD=1_000_000_007;
        int ple[] = new int[n];
        int nle[]=new int[n];
        Deque<Integer>st = new ArrayDeque<>();
        for(int i=0;i<n;i++){
           while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
           }
           ple[i]=st.isEmpty()?(i+1):(i-st.peek());
           st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
           while(!st.isEmpty() && arr[st.peek()]>arr[i]){
            st.pop();
           }
           nle[i]=st.isEmpty()?(n-i):(st.peek()-i);
           st.push(i);
        }
        long total=0;
        for(int i=0;i<n;i++){
            long count=(long)ple[i]*nle[i];
            total = (total+count*arr[i])%MOD;
        }
        
    return (int)total;  
    }
}