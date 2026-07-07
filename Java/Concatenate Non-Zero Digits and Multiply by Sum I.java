class Solution {
    public long sumAndMultiply(int n) {
        int x =0;
        int sum=0;
        int digit=0;
        int i=0;
        while(n!=0){
            if(n%10!=0){
            digit=n%10;
            x=x+digit*(int)(Math.pow(10,i));
            sum+=digit;
            i++;
            }
            n=n/10;
        }
        return (long)x*sum;
        
    }
}
