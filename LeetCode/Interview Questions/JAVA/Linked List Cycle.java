public class Solution {
    public boolean hasCycle(ListNode head) {
        //Using hashtable
        HashMap<ListNode, Integer> map =  new HashMap<>();
        int pos = 0;
        while(head!=null){
            if(!map.containsKey(head)){
                map.put(head, pos);
            }else{
                return true;
            }
            head = head.next;
        }
        return false;
    }
}