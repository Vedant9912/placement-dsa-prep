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
