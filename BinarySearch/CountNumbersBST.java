import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root, int lo, int hi) {
       int cont = 0;
        if(root!=null){
            cont+=solve(root.left, lo, hi);
            cont+=solve(root.right, lo, hi);
            if(root.val>=lo && root.val<=hi)
                cont+=1;
        }return cont;
    }
}