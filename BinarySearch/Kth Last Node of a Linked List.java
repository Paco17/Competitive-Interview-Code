import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node, int k) {
        LLNode slow = node;
        LLNode fast = node;
        while(k>0){
            fast = fast.next;
            k--;
        }
        
        while(fast.next!=null || fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow.val;
        
        
    }
}