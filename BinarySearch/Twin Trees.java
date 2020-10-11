import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root0, Tree root1) {
        if(root0==null && root1==null)
            return true;
        else if(root0==null || root1==null)
            return false;
        else{
            return verificacion(root0, root1); 
        }
    }
    
    
    public boolean verificacion(Tree root0, Tree root1){
        //Un valor nulo y otro no
        if(root0==null && root1==null){
            return true;
        }
        
        if(root0==null|| root1==null){
            return false;
        }
        
        //Diferente valor
        if(root0.val!=root1.val){
            return false;
        }
        
        //Mismo valor recursion
        boolean left = verificacion(root0.left, root1.left);
        boolean right = verificacion(root0.right, root1.right);
        return (right && left);
        
    }
}