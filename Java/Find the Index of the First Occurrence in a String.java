class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length()-1;
        for(int i=n;i<haystack.length();i++){
            if(needle.equals(haystack.substring(i-n,i+1))){
                return i-n;
            }
        }
        return -1;
        
    }
}
