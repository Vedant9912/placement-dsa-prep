import java.util.Arrays;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        for(int i=arr.length-2 ; i>=0;i--){
            if (arr[i]<max){
                return arr[i];
            }
        }
        return -1;
    }
}




import java.util.Arrays;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=arr[0] ;
        int secondlargest=-1;
        
        for ( int i = 0 ; i < arr.length ; i++){
            if (arr[i]>largest){
                
                secondlargest=largest;
                largest=arr[i];
            }
            else{
                if (arr[i]>secondlargest && arr[i]!=largest){
                    secondlargest= arr[i];
                    
                }
            }
        }
        return secondlargest;
    }   
}
