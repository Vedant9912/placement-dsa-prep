class Solution {
    public boolean canChange(String start, String target) {
        if (!start.replaceAll("_","").equals(target.replaceAll("_",""))){
            return false;
        }
        int i =0;
        int j =0;
        while(i<start.length() && j < target.length()){
            while ( i<start.length() && start.charAt(i) == '_'){
                i++;

            }
            while ( j<target.length() && target.charAt(j) == '_'){
                j++;

            }
            if (i == start.length() || j == target.length()) break;
            if (j>i && start.charAt(i)=='L'){
                return false;
            }
            if (i>j && start.charAt(i)=='R'){
                return false;

            }
            i++;
            j++;


            }
        
        return true;

        
    }
}
