class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode res = l3;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                l3.next = l1;
                l1 = l1.next;
            }
            else{
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        while(l1!=null){
            l3.next = l1;
            l1 = l1.next;
            l3 = l3.next;
        }
        while(l2!=null){
            l3.next = l2;
            l2 = l2.next;
            l3 = l3.next;
        }
        return res.next;
    }
}
