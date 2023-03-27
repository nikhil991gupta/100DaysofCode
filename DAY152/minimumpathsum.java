// class Solution {
//     public int minPathSum(int[][] grid) {
//         if(grid==null || grid.length==0)
//         {
//             return 0;
//         }
//         int ans =path(0,0,grid);
//         return ans;
//     }
//     public static int path(int right,int left,int[][] grid)
//     {
//         int a=grid.length-1;
//         int b=grid[0].length-1;
//         if(right==a && left ==b)
//         {
//             return grid[a][b];
//         }
                    
//         if(right>a || left>b)
//         {
//             return Integer.MAX_VALUE;
//         }
// int path1=path(right+1,left,grid);//down
// int path2=path(right,left+1,grid);//right
// return grid[right][left] + Math.min(path1,path2);





//     }

// }





class Solution {
     
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0)
        {
            return 0;
        }
        int m = grid.length;
        int n = ¯grid[0].length;
        
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i-1][0];
        }
        
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j-1];
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        
        return grid[m-1][n-1];
    }
}
