class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        result=[]
        intervals.sort()
      
        result.append(intervals[0])
        j=1


        while j < len(intervals):
            if result[-1][1]>=intervals[j][0]:
                result[-1][1]=max(result[-1][1],intervals[j][1])
                j+=1
            else:
                result.append(intervals[j])
                j+=1

        return result
           
