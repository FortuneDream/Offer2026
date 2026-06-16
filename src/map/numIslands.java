package map;
//岛屿数量
//dfs 涂色
public class numIslands {
    public static int numIslands(char[][] grid) {
        int row = grid.length;
        int column =grid[0].length;
        int islands=0;
        for (int i = 0;i<row;i++){
            for (int j = 0; j < column; j++) {
                if (grid[i][j]=='1'){
                    islands++;
                    dfs(grid,i,j);
                }
            }
        }
        return islands;
    }

    public static void dfs(char[][] grid,int i,int j){
        if (!isArea(grid,i,j)){
            return;
        }

        if (grid[i][j]!='1'){
            return;
        }
        grid[i][j]='2';
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i-1,j);
    }

    public static boolean isArea(char[][] grid,int i,int j){
        int row = grid.length;
        int column =grid[0].length;
        if (i<0||i>row||j<0||j>column){
            return false;
        }
        return true;
    }
}
