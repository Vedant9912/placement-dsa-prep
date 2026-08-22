class Solution {
    public int minSwaps(String s) {
        int open=0;
        int close=0;
        int count=0;
        int i=s.length()-1;
        for(char ch : s.toCharArray()){
            if(ch=='['){
                open++;
            }else{
                close++;
            }
            if(close>open){
                int open1=0;
                int close1=0;
                while(i>=0){
                    if(s.charAt(i)=='['){
                open1++;
                }else{
                close1++;
                }
                if(open1>close1){
                    count++;
                    i--;
                    open++;
                    close--;
                    break;
                }
                i--;
            }
                    
                }
            }

        
        return count;
        
    }
}
