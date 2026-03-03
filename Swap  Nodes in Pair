class Solution(object):
    def swapPairs(self, head):
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy
        
        while head and head.next:
            first = head
            second = head.next
            
            # swapping
            prev.next = second
            first.next = second.next
            second.next = first
            
            # move pointers
            prev = first
            head = first.next
            
        return dummy.next
