class Solution {
    public String shift(int a , int b , String s){
        char ch1 = s.charAt(a);
        char ch2= (char)(ch1+(s.charAt(b)-'0'));
        return "" + ch1 + ch2;
    }
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length();i=i+2){
            if(i+1 < s.length()){
            sb.append(shift(i,i+1,s));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        
    
}}
