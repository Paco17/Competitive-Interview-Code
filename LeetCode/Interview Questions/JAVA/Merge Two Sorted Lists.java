class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode dummyHead = l3;
        
        //Recorrer las ListNode y retornar sorted list
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                dummyHead.next = l1;
                l1 = l1.next;
            }else{
                dummyHead.next = l2;
                l2=l2.next;
            }
            
            dummyHead = dummyHead.next;
        }
        
        if(l1!=null)
            dummyHead.next = l1;
        
        if(l2!=null)
            dummyHead.next = l2;
            
        return l3.next;
    }
}