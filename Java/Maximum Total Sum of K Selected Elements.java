import java.util.Arrays;
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            }
        long product=0;
        for(int i = 0 ; i < k ; i++){
            if(mul!=0){
            product+=(long)nums[i]*mul;
            mul--;
            }
            else{
                product+=nums[i];
            }
        }
        return product;
    }
}
