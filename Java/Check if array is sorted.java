import java.util.Arrays;
class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int[] copy = arr.clone();
        Arrays.sort(copy);
        if(Arrays.equals(arr,copy)){
            return true;
        }
        return false;
    }
}



import java.util.Arrays;
class Solution {
    public boolean isSorted(int[] arr) {
        for ( int i = 1 ; i < arr.length  ; i++){
            if (arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
