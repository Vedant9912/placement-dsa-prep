class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s.length()<p.length()) return result;
        int[] window = new int[26];
        int[] pfreq = new int[26];

        for(char ch : p.toCharArray()){
            pfreq[ch-'a']+=1;
        }
        int i = 0;
        for(int j = 0 ;  j < s.length() ; j++ ){
            window[s.charAt(j)-'a']++;
            if(j-i+1>p.length()){
                pfreq[s.charAt(i)-'a']+=1;
                i++;

            }
            if(Arrays.equals(window,pfreq)){
                result.add(i);
                
            }
        }
        return result;
        
    }
}
