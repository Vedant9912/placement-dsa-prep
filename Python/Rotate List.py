class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        if not head or not head.next:
            return head
        right=head
        length=0
        while right:
            right=right.next
            length+=1

        n=k%length
        for i in range(n):
            right=head
            while right.next and right.next.next:
                right=right.next
            last = right.next
            right.next = None
            last.next = head
            head = last
        return head
        
        
