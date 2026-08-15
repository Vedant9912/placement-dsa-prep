class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i = low ; i <= high ; i++){
            int digit = i ;
            String s=String.valueOf(i);
            int sumf=0;
            int sum=0;
            if(s.length()%2==0){ 
            while(digit!=0){
                sumf+=digit%10;
                digit=digit/10;
            }
            for(int j = 0 ; j <s.length()/2 ; j++ ){
                sum+=Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            if(sum*2==sumf){
                count++;
            }


            }
            
        }
        return count;
        }
        
    }
