class Solution {
    public boolean isBalanced(String s) {
        // code here
        ArrayDeque<Character> dequeStack = new ArrayDeque<>();
        char top;
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch == '{' || ch=='['){
            dequeStack.push(ch);}
            else{
                if (dequeStack.isEmpty()){
                    return false;
                }
                top=dequeStack.pop();
                if (ch==')'&& top!='('||
                ch=='}'&& top!='{'||
                ch==']'&& top!='['){
                    return false;
                }
                
                
            }}
        if(dequeStack.peek()==null){
            return true;
        }
        return false;
        
    }
}
