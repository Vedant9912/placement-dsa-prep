class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        newdict=dict()
        for i in range(len(strs)):
            key= "".join(sorted(strs[i]))
            if key not in newdict:
                newdict[key]=[]
            newdict[key].append(strs[i])
        return list(newdict.values())





#JAVA

# class Solution {
#     public List<List<String>> groupAnagrams(String[] strs) {
#             Map<String, List<String>> map = new HashMap<>();

#             for(String s: strs){
#                 char[] Char=s.toCharArray();
#                 Arrays.sort(Char);
#                 String Key=new String(Char);

#                 map.putIfAbsent(Key , new ArrayList<>());
#                 map.get(Key).add(s);

                
#             }
#             return new ArrayList<>(map.values());



#         }}
        
