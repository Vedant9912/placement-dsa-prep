class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] window = new int[26];
        int[] s1feq = new int[26];

        for(char ch : s1.toCharArray()){
            s1feq[ch-'a']++;
        }
        int i =0;
        for(int j = 0 ; j < s2.length() ; j++){
            window[s2.charAt(j)-'a']++;

            if(j-i+1>s1.length()){
                window[s2.charAt(i)-'a']--;
                i++;

            }
            if(Arrays.equals(window,s1feq)) return true;

        }
        return false;
        
    }
}
