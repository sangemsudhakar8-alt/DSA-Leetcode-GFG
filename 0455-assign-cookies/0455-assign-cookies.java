class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child =0;
        int cook=0;
        while(child<g.length && cook<s.length){
            if(s[cook]>=g[child]){
                child++;
            }
            cook++;
        }
        return child;
    }
}