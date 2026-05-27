class Solution {
    public boolean isHappy(int n) {
        int slow=cal(n);
        int fast=cal(cal(n));
        while(fast!=1 && slow!=fast){
            slow=cal(slow);
            fast=cal(cal(fast));

        }
        return fast==1;


        
    }
    public static int cal(int m){
        int value=0;
        while(m!=0){
            value=value + (int)Math.pow((int)m%10,2);
            m=m/10;
        }
        return value;
    }
}
