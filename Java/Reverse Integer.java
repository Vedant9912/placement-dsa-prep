class Solution {
    public int reverse(int x) {
        int digit=0;
        long num=0;
        while(x!=0){
            digit=x%10;
            x/=10;
            num=digit+ num*10;
        }
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)num;
    }
}
