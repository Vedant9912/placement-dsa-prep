class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int counter=0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                counter++;
            }
            else{
                if(counter>0){
                    counter--;
                }
                else{
                    sb1.append(s.charAt(i));
                }
            }

        }
        counter=0;
        for(int i = t.length()-1;i>=0;i--){
            if(t.charAt(i)=='#'){
                counter++;
            }
            else{
                if(counter>0){
                    counter--;
                }
                else{
                    sb2.append(t.charAt(i));
                }
            }

        }
        return sb1.toString().equals(sb2.toString());


        
    }
}
