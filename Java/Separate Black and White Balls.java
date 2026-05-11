class Solution {
    public long minimumSteps(String s) {
        int write = 0;
        int count=0;
        long swaps=0;
        for ( int read =0 ; read <  s.length();read++){
            if (s.charAt(read)=='0'){
                swaps+=read-write;
                write++;

            }


        }
        return swaps;
        
    }
}
