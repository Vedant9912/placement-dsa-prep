class Solution {
    public boolean isSubsequence(String s, String t) {
        int read1=0;
        int read2=0;
        while(read2<t.length() ){
            if (read1==s.length()){
                return true;
            }
            if (s.charAt(read1)==t.charAt(read2)){
                read1++;

            }
            read2++;
        }
        return read1==s.length() || false;
        
    }
}
