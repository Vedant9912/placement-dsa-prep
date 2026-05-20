import java.util.Arrays;
class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1];
        
    }
}




import java.util.Arrays;
class Solution {
    public static int largest(int[] arr) {
        // code here
        int x=arr[0];
        for(int i=1 ; i < arr.length ; i++){
            if ( x<arr[i]){
                x=arr[i];
            }
        }
        return x;
        
    }
}

