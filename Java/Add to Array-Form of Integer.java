class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr= new ArrayList<>();
        int i = num.length-1;
        int digit;
        int carry=0;
        int sum;
        while(i>=0 || k!=0){
            digit=k%10;
            sum=0;
            if ( i>=0){
                sum+=num[i];

            }
            sum+=digit+carry;
            carry=sum/10;
            arr.add(sum%10);
            k=k/10;
            i--;

        }
        if(carry!=0){
            arr.add(carry);
        }
        Collections.reverse(arr);
        return arr;
        
    }
}
