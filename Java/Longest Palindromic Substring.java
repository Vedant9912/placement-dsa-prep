class Solution {
    public String longestPalindrome(String s) {
        String s1="";
        int n=s.length();
        int L;
        for(int i=0 ; i < s.length();i++){
            L=i;

            if (s1.length()<expand(L,L,n,s).length()){
                s1=expand(L,L,n,s);

            }
             if (s1.length()<expand(L,L+1,n,s).length()){
                s1=expand(L,L+1,n,s);

            }
        }

        return s1;
        
    }

    public String expand(int L , int R , int n, String s){
        while (L>=0 && R<n){
            if(s.charAt(L)!=s.charAt(R)){
                break;
            }
            L--;
            R++;
        }
        return s.substring(L+1,R);


    }
}
    
