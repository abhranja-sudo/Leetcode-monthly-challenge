// Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
//  An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
//  You may assume all four edges of the grid are all surrounded by water.

class Solution {
    static int count;
    static int[][] visited;
    public int numIslands(char[][] grid) { 
        count =0;
        if(grid.length>0){
        visited = new int[grid.length][grid[0].length];
            for(int i = 0; i<grid.length;i++){
                for(int j = 0 ; j<grid[0].length; j++){
                    if(visited[i][j]==0 && grid[i][j]=='1'){
                        count+=1;
                        helper(grid,i,j);
                    }
                }
            }
        }
        return count;
    
    }
    
    public void helper(char[][] grid, int i, int j){
        visited[i][j] = 1;
        if(i>0 && grid[i-1][j]=='1' && visited[i-1][j]==0){
            helper(grid,i-1,j);
        }
        if(j>0 && grid[i][j-1]=='1' && visited[i][j-1]==0){
            helper(grid,i,j-1);
        }
        if(j<grid[0].length-1 && grid[i][j+1]=='1' && visited[i][j+1]==0){
            helper(grid,i,j+1);
        }
        if(i<grid.length-1 && grid[i+1][j]=='1' && visited[i+1][j]==0){
            helper(grid,i+1,j);
        }
    }
}