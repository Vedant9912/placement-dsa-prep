class Solution {
    public String reverseVowels(String s) {
        Set<Character> arr = new HashSet<>(
    Arrays.asList('a','e','i','o','u','A','E','I','O','U')
);
        int left=0;
        int right=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(left < right){
            if (left<right && !arr.contains(s.charAt(left))){
                left++;
            }
            if (left < right && !arr.contains(s.charAt(right))){
                right--;
            }
            if(arr.contains(s.charAt(left)) && arr.contains(s.charAt(right))){
                char temp = sb.charAt(left);
                sb.setCharAt(left,s.charAt(right));
                sb.setCharAt(right,temp);
                left++;
                right--;
            }
            
        }
        return sb.toString();
        
    }
}
