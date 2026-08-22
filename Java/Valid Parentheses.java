class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char s1 : s.toCharArray()){
                if(s1=='(' || s1=='[' || s1=='{'){
                    stack.push(s1);


                }
                else if(stack.size()==0){
                    return false;

                }

            if(s1==')' || s1==']' || s1=='}'){
                if(stack.peek()=='(') if(s1!=')') return false;
                if(stack.peek()=='[') if(s1!=']') return false;
                if(stack.peek()=='{') if(s1!='}') return false;

                stack.pop();


            }

        }
        return stack.size()==0;
    }

}
    
