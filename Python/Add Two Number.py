# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        result=ListNode()
        dummy=result
        carry=0
        while l1 or l2 or carry:
            if l1:
                operand1=l1.val
                l1=l1.next
            else:
                operand1=0

            if l2:
                operand2=l2.val
                l2=l2.next
            else:
                operand2=0

            summ=operand1+operand2+carry
            carry=0
            carry=summ//10
            summ=summ%10

            result.next=ListNode(summ)
            result=result.next

        return dummy.next
