class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();
        int[] pos = new int[m+n];
        int p1, p2;
        int mul;
        for(int i=m-1 ; i>=0 ; i--){
            for(int j = n-1; j>=0;j--){
                mul=Character.getNumericValue(num1.charAt(i))*Character.getNumericValue(num2.charAt(j));
                p1=i+j;
                p2=i+j+1;
                pos[p2]+=mul;
                pos[p1]+=pos[p2]/10;
                pos[p2]%=10;


            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k : pos){
            if(!(sb.length()==0 && k==0)){
                sb.append(k);

            }
        }
        if(sb.length()==0){
            return "0";
        }

        return sb.toString();
    }
}
