package Challenge_30Day;

public class Day18_MinimumPathSum {
    private int helper(int[][] grid, int i, int j) {
        if(i==grid.length || j==grid[0].length) return Integer.MAX_VALUE;
        if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j];
        return grid[i][j] + Math.min(helper(grid, i+1, j), helper(grid, i, j+1));
    }
    private int minPathSumBruteForce(int[][] grid) {
        return helper(grid,0, 0);
    }

    private int minPathSum(int[][] grid) {
        for(int i = grid.length - 1; i>=0; i--) {
            for(int j=grid[0].length -1; j>=0; j--) {
                if(i==grid.length-1 && j!= grid[0].length -1) //if last row, then move to next column
                    grid[i][j] = grid[i][j] + grid[i][j+1];
                else if(i != grid.length -1 && j== grid[0].length -1) //if last column, then move to next row
                    grid[i][j] = grid[i][j] + grid[i+1][j];
                else if(i!= grid.length -1 && j != grid[0].length -1) //else choose minimum of next row/col combo from allowable directions
                    grid[i][j] = grid[i][j] + Math.min(grid[i+1][j], grid[i][j+1]);
            }
        }
        return grid[0][0];
    }

    public static void main(String[] args) {
        System.out.println(new Day18_MinimumPathSum().minPathSumBruteForce(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}}));
        System.out.println(new Day18_MinimumPathSum().minPathSumBruteForce(new int[][]{
                {1, 3, 4, 8},
                {3, 2, 2, 4},
                {5, 7, 1, 9},
                {2, 3, 2, 3}}));

        System.out.println(new Day18_MinimumPathSum().minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}}));
        System.out.println(new Day18_MinimumPathSum().minPathSum(new int[][]{
                {1, 3, 4, 8},
                {3, 2, 2, 4},
                {5, 7, 1, 9},
                {2, 3, 2, 3}}));
    }
}
