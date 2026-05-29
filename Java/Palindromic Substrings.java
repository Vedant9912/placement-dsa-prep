class Solution {
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        int L;
        for(int i=0 ; i < s.length();i++){
            L=i;

            count+=expand(L,L,n,s);
            count+=expand(L,L+1,n,s);
        }

        return count;
        
    }

    public int expand(int L , int R , int n, String s){
        int count1=0;
        while (L>=0 && R<n){
            if(s.charAt(L)!=s.charAt(R)){
                break;
            }
            count1++;
            L--;
            R++;
        }
        return count1;


    }
}
