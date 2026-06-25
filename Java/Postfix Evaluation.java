class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        int n1;
        int n2;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String s : arr){
            if(Character.isDigit(s.charAt(0)) || (s.length()>1 && s.charAt(0)=='-')){
            stack.push(Integer.parseInt(s));
                
            }
            else{
                n2= stack.pop();
                n1= stack.pop();
                switch (s){
                    case "+":
                        stack.push(n1+n2);
                        break;
                    case "-":
                        stack.push(n1-n2);
                        break;
                    case "*":
                        stack.push(n1*n2);
                        break;
                    case "/":
                        stack.push(Math.floorDiv(n1,n2));
                        break;
                    case "^":
                        stack.push((int)Math.pow(n1,n2));
                        break;
                }
                
            }
        }
        return stack.peek();
    }
}
