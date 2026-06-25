class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(-1);
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                ans.set(stack.pop(),arr[i]);
            }
            stack.push(i);
        }
        return ans;
    }
}
