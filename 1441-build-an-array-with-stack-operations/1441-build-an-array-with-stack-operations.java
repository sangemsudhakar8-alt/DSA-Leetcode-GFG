class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int targetidx = 0;
        for(int num =1;num<=n && targetidx<target.length;num++){
            res.add("Push");
            if(num == target[targetidx]){
                targetidx++;
            }else{
                res.add("Pop");
            }
        }
        return res;
    }
}