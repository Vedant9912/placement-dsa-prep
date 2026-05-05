class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        dictt={5:0 ,10:0 ,20:0}
        for i in range(len(bills)):
            if bills[i]==5:
                dictt[bills[i]]+=1
            elif bills[i]==10:
                if dictt[5]!=0:
                    dictt[10]+=1
                    dictt[5]-=1
                else:
                    return False
            else:
                if dictt[10]!=0 and dictt[5]!=0:
                    dictt[20]+=1
                    dictt[10]-=1
                    dictt[5]-=1
                elif dictt[5]>=3:
                    dictt[5]-=3
                else:
                    return False
        return True
