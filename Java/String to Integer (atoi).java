class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        String news="";
        boolean negative=false;
        boolean positive=false;
        int sign=1;
        if(s.charAt(0)=='-'){
            sign=-1;

        }
        else if(s.charAt(0)=='+'){
        }
        else{
            if(Character.isDigit(s.charAt(0))){
            news+=s.charAt(0);
            }
            else{
            return 0;}
        }
        for(int i = 1 ; i < s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){
            news+=s.charAt(i);
            }
            else{
                break;
            }
            
        }
        long result=0;
        for(int i = 0 ; i < news.length() ; i++){
            result = result*10+(news.charAt(i)-'0');
            if(result*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(result*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;

        }
        result*=sign;

        return (int)result;

    }
}
