class Solution {
  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

   ListNode even = head;
   ListNode odd = head.next;
   
   ListNode old = odd;
   
   while(odd!=null&&odd.next!=null){
     even.next = odd.next;
     even = odd.next;
     odd.next = even.next;
     odd = even.next;
   }even.next = old;
   return head;
  }
}