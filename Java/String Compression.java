class Solution {
    public int compress(char[] chars) {
        int write=0;
        int read;
        int left=0;
        for (read =0 ; read < chars.length; read++){
            if (chars[read]!=chars[left]){
                if (read-left!=1){
                    String s = String.valueOf(read-left);
                    for(char c : s.toCharArray()){
                        chars[++write] = c;
                        }
                }
                left=read;
                chars[++write]=chars[left];
            
            }

        }
        if (read-left!=1){
            String s = String.valueOf(read-left);
                    for(char c : s.toCharArray()){
                        chars[++write] = c;
                        }
                }
            

        return write+1;
        
    }
}
