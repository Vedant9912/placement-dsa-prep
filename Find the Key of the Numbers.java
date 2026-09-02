class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int digit=0;
        int i=0;
        while(num1!=0 && num2!=0 && num3!=0){
            int n1=0;
            int n2=0;
            int n3=0;
            n1=num1%10;
            num1/=10;
            n2=num2%10;
            num2/=10;
            n3=num3%10;
            num3/=10;
            digit+=Math.min(n1, Math.min(n2,n3))*Math.pow(10,i);
            i++;
        }
        return digit;
        
    }
}
