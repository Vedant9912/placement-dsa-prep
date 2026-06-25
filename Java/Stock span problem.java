class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList <Integer> ans = new ArrayList<>();
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        for(int i =0 ; i < arr.length ; i++){
            ans.add(1);
            
        }
        
        for(int i =0 ; i < arr.length; i++){
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans.set(i,i+1);
            }
            else{
                ans.set(i,i-stack.peek());
            }
            stack.push(i);
        }
        return ans;
    }
}
