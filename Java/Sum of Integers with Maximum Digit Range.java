class Solution {
    public int maxDigitRange(int[] nums) {
        int[] arr = new int[nums.length];
        int mdigitrange=0;
        int i=0;
        for(int num : nums){
            int min=Integer.MAX_VALUE;
            int max=0;
            int digit=0;
        if(num!=0){  
        while(num!=0){
            digit=num%10;
            num=num/10;
            min=Math.min(digit,min);
            max=Math.max(digit,max);
        }   }
        else{
            max=0;
            min=0;
        }
        mdigitrange=Math.max(mdigitrange,max-min); 
        arr[i]=max-min;
        i++;   
        }
        int sum=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==mdigitrange){
                sum+=nums[j];
            }
        }
        return sum;  
    }
}
