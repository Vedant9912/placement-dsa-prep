class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n=a.length()-1;
        int m=b.length()-1;
        int sum;
        int carry=0;
        while(n>=0 || m>=0){
            int A=0;
            int B=0;
            if (n>=0){
                A=a.charAt(n)-'0';
                n--;
            }
            if (m>=0){
                B=b.charAt(m)-'0';
                m--;
            }
            sum=A+B+carry;
            sb.append(sum%2);
            carry=sum/2;
            

        }
        if (carry!=0){
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();
        
    }
}
