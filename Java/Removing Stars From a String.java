class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int counter=0;

        for ( int i=s.length()-1; i >=0 ; i--){
            if (s.charAt(i)=='*'){
                counter++;
            }
            else{
                if(counter==0){
                    sb.append(s.charAt(i));
                }else{
                    counter--;
                }
            }


        }
        return sb.reverse().toString();
        
    }
}
