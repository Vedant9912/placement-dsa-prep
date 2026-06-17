import java.util.Arrays;
class Solution {
    ArrayList<Integer> find(int arr[], int target) {
        // code here
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if (arr[left]!=target){
                left++;}
            if (arr[right]!=target){
                right--;
            }
            if(arr[left]==target && arr[right]==target){
                return new ArrayList<>(Arrays.asList(left,right));
            }
            
        }
        return new ArrayList<>(Arrays.asList(-1,-1));
        
    }
}
