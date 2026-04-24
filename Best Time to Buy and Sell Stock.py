class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprofit=0
        buy=float("inf")
        for i in range(len(prices)):
            if prices[i]<buy:
                buy=prices[i]

            elif maxprofit<prices[i]-buy:
                maxprofit=prices[i]-buy
            else:
                pass

        return  maxprofit
