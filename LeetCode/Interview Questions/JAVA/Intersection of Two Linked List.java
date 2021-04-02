public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;
        ListNode dummyHeadA = headA;
        ListNode dummyHeadB = headB;
            while(dummyHeadA!=dummyHeadB){
                if(dummyHeadA == null)
                    dummyHeadA = headB;
                else
                    dummyHeadA = dummyHeadA.next;
                
                if(dummyHeadB == null)
                    dummyHeadB = headA;
                else
                    dummyHeadB = dummyHeadB.next;
            }
                       
        return dummyHeadA;
    }
}