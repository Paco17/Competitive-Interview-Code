class Solution {
    int count=0;
    
    public int solve(Tree root) {
        maximal(root);
        return count;
    }
    
    public int maximal(Tree root){
        if(root==null){
            return 0;
        } 
        
        int left = solve(root.left);
        int right = solve(root.right);
        
        if(root.val >= left && root.val >= right){
            count++;
        }
        
        int x = Math.max(root.val, Math.max(left,right));
        return x;
    }
}