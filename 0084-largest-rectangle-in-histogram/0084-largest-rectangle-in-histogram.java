class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int nse[] = findnse(heights);
        int pse[] =findpse(heights);
        int max=0;
        for(int i=0;i<n;i++){
         max=Math.max(max,heights[i] *(nse[i]-pse[i]-1));
        }
        return max;
    }
    private static int[] findnse(int[] arr){
    Stack<Integer>st = new Stack<>();
    int a[]=new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
        while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            a[i]=arr.length;
        }else{
            a[i] =st.peek();
        }
        st.push(i);
    }
    return a;
    }
    private static int[] findpse(int[] arr){
         Stack<Integer>st = new Stack<>();
         int a[]=new int[arr.length];
         for(int i=0;i<arr.length;i++){
         while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            a[i]=-1;
        }else{
            a[i] =st.peek();
        }
        st.push(i);
    }

    return a;
    }
}