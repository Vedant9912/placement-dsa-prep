class Solution(object):
    def frequencySort(self, s: str) -> str:
        freq={}
        for i in s:
            freq[i]=freq.get(i,0) +1
        
        sortedfreq =sorted(freq.items() , key = lambda x:x[1]  , reverse =True)

        result=""
        for char , val in sortedfreq:
            result+=char*val
        return result
