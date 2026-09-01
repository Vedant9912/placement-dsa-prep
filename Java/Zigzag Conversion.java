class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<2 || numRows<2) return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
            }
        int index=0;
        int temp=-1;
        for(int i = 0 ; i < s.length() ; i++){
            if(index<numRows){
            arr[index].append(s.charAt(i));
            index++;
            }
            else{
                if(temp==-1){
                temp=index-2;}
                arr[temp].append(s.charAt(i));
                temp--;
                if(temp<0){
                    index=1;
                    temp=-1;
                }    
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : arr) {
            result.append(sb);
            }
            return result.toString();
        
    }
}
