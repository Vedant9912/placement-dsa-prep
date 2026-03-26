class Solution:
    def reconstructQueue(self, peoples: List[List[int]]) -> List[List[int]]:
        peoples.sort(key= lambda x: (-x[0] , x[1]) )
        result=[]
        for people in peoples:
            result.insert(people[1],people)
        return result
