class Solution {
    public boolean solve(int[][] matrix, int target) {
        // Write your code here
        
        /*[1, 3, 9]
          [2, 5, 10]
          [5, 7, 13]*/
        
        //Consider starting the search from the top right corner of matrix.
        int i=0, j=matrix[i].length-1;
            while(j>=0 && i<matrix.length){
                if (matrix[i][j] == target)
                    return true;
                    
                if(matrix[i][j] > target){
                    --j;
                }else{
                    ++i;
                }
            }return false;
    }
}
