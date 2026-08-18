class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>,Integer>ans=new HashMap<>();
        int count=0;
        for(int i=0;i<grid.length;i++){
            List<Integer>row=new ArrayList<>();
            for(int k = 0; k < grid.length; k++) {
            row.add(grid[i][k]);
             }
            if(ans.containsKey(row))
            ans.put(row,ans.get(row)+1);
            else
            ans.put(row,1);
        }

            for(int j=0;j< grid.length;j++){
            List<Integer>col=new ArrayList<>();
             for(int k = 0; k < grid.length; k++) {
            col.add(grid[k][j]);
             }
            if(ans.containsKey(col))
            count+= ans.get(col);
            else
            continue;
        }
        return count;
    }
}