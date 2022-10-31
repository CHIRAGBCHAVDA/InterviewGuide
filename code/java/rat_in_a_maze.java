public class Solution {

  public static boolean ratInAMaze(int a[][], boolean vis[][], 
        int i, int j) {

      int n = a.length;
      //Base conditions
      if(i >= n || j >= n || a[i][j] == 0 || vis[i][j]) {
        return false;
      }
      // Base condition for successfully reached
      if(i == n-1 && j == n-1) return true;

      // Mark this cell as visited
      vis[i][j] = true;

      // check if a path is possible from down
      if(ratInAMaze(a, vis, i+1, j)) return true;

      // check if a path is possible from right
      if(ratInAMaze(a, vis, i, j+1)) return true;

      // Mark this cell as unvisited & Backtrack
      vis[i][j] = false;

      // backtrack
      return false;
  }
}
