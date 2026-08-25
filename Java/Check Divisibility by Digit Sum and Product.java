class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int m=n;
        while(m!=0){
            sum+=m%10;
            mul*=m%10;
            m=m/10;

        }
        return n%(mul+sum)==0;
        
    }
}
