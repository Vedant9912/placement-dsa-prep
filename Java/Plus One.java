class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length-1;
        int sum=0;
        int carry=1;
        ArrayList<Integer> arr= new ArrayList<>();
        for (int i = n ; i >= 0 ; i--){
      
            sum=digits[i]+carry;
            arr.add(sum%10);
            carry=sum/10;
            
        }
        if(carry!=0){
            arr.add(carry);
        }
        
        int[] a=new int[arr.size()];
        for(int i = arr.size()-1; i>=0; i--){
            a[i]=arr.get(arr.size()-1-i);
        }
        return a;
    }
}
