class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int j=0;
        for(int i = 1 ; i < arr[arr.length-1]+k+1;i++){
            if(j<arr.length){
            if(i!=arr[j]){
                  count++;}
            else{
                j++;
            }}
            else{
                count++;
            }
            if(count==k) return i;
        }
        return -1;

        
    }
}
