class Solution:
    def isPalindrome(self, s: str) -> bool:
        newS=""
        for i in s:
            if i.isalnum():
                newS+=i.lower()
        return newS==newS[::-1]


# JAVA
# class Solution {
#     public boolean isAnagram(String s, String t) {
#         char[] arr1=s.toCharArray();
#         char[] arr2=t.toCharArray();
#         Arrays.sort(arr1);
#         Arrays.sort(arr2);
#         return Arrays.equals(arr1,arr2);
        
        

        
#     }
# }
