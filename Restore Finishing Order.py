class Solution:
    def recoverOrder(self, order: List[int], friends: List[int]) -> List[int]:
        ans=[]
        friends_set=set(friends)
        for i in order:
            if i in friends_set:
                ans.append(i)
        return ans
