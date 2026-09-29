class Solution {
    private Boolean[][][] memo;
    private int m,n;
    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        if((m+n-1)%2!=0) return false;
        if(grid[0][0]==')')return false;
        memo = new Boolean[m][n][(m+n)/2+1];
        return dfs(0,0,0,grid);
        
    }
    private boolean dfs(int r,int c,int balance,char[][] grid){
        if(grid[r][c]=='('){
            balance++;
        }else{
            balance--;
        }
        if(balance<0|| balance>(m+n)/2) return false;
        if(r==m-1 && c==n-1){
            return balance ==0;
        }
        if(memo[r][c][balance]!=null){
            return memo[r][c][balance];
        }
        boolean found =false;
        if(r+1<m){
            found = dfs(r+1,c,balance,grid);
        }
        if(!found && c+1<n){
            found = dfs(r,c+1,balance,grid);
        }
        return memo[r][c][balance]=found;
    }
}