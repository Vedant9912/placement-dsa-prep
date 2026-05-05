class Solution(object):
    def rob(self, cost):

        n = len(cost)
        if n == 0:
            return 0
        if n == 1:
            return cost[0]

        prev1 = cost[0]
        prev2 = max(cost[0], cost[1])

        for i in range(2, n):
            curr = max(cost[i] + prev1, prev2)
            prev1 = prev2
            prev2 = curr

        return prev2
