class Solution {
    public int longest(int l , int r , int[] arr){
        int count1=0;
        int count2=0;
        while (true){
            boolean  moved = false;
            if(l>0 && arr[l-1]<arr[l]){
                l--;
                count1++;
                moved=true;

            }
            if(r<arr.length-1 && arr[r+1]<arr[r]){
                r++;
                count2++;
                moved=true;
            }
            if(!moved){
                break;
            }
        }


        if(count1!=0 && count2!=0){
            return r+1-l;}
        else{
            return 0;
                }
            



        }


    public int longestMountain(int[] arr) {
        int maxlen=0;
        for(int i = 0 ; i < arr.length ; i++){
            if (i>0 && i<arr.length-1 && arr[i]>arr[i-1] && arr[i]>arr[i+1]){
            int len=longest(i,i,arr);
            if ( maxlen < len){
                maxlen=len;
            }

        }
        }

        return maxlen;
        
    }
}
