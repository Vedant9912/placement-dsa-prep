class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        L=0
        R=0
        Unknown=0
        for i in moves:
            if i =="R":
                R+=1
            elif i=="L":
                L+=1
            else:
                Unknown+=1
        Total=L-R
        return abs(Total)+Unknown
