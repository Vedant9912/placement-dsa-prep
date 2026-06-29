/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA=0;
        int countB=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while (tempA!=null){
            countA+=1;
            tempA=tempA.next;
        }
        while (tempB!=null){
            countB+=1;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;

        while(countA>countB){
            tempA=tempA.next;
            countA--;
            }
        while(countA<countB){
            tempB=tempB.next;
            countB--;
            }

        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;

        
    }
}
