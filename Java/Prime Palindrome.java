class Solution {
     public static boolean isPrime(int m){    
            int limit = (int)Math.sqrt(m);
            for(int i=3; i <= limit; i+=2){
                if(m%i==0){
                    return false;
                }
            }
            return true;
    }
    public int primePalindrome(int n) {
        if(n == 1){
            return 2;
            }
        if (n == 2) return 2;
        if (10000000 < n && n < 100000000) {
            return 100030001;
            }
        boolean check=true;
        while(true){
            if (n % 2 == 0) {
                n++;
                continue;
            }
            check=true;
        String s = String.valueOf(n);
                int left=0;
                int right=s.length()-1;
                while(left<right){
                    if(s.charAt(left) != s.charAt(right)){
                        check=false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(check==true){
                    check =isPrime(n);
                    if(check==true){
                        return n;
                    }
                }
                n++;

            
        }
    }
}
     
