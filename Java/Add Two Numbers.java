/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;

        ListNode temp= new ListNode(0,null);
        ListNode dummyhead=temp;
        while (l1!= null || l2 != null  ||  carry!=0){
            temp.next=new ListNode();
            temp=temp.next;
            if(l1==null && l2 == null){
                sum=carry;
            }
            else if(l1==null){
                sum=l2.val+carry;
            }
            else if (l2==null){
                sum=l1.val+carry;
            }
            else{
                sum=l1.val+l2.val + carry;

            }
            carry=sum/10;
            temp.val=sum%10;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummyhead.next;
        
    }
}
