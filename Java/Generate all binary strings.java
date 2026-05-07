class Generate{
    public static void gen(int index,char[] arr ,ArrayList<String> result){
        if (index==arr.length){
            result.add(new String(arr));
            return;
        }
        arr[index]='0';
        gen(index+1,arr,result);
        arr[index]='1';
        gen(index+1,arr,result);
            
    }
    
}




class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        char arr[] = new char[n];
        ArrayList<String> result = new ArrayList<>();
        Generate.gen(0,arr,result);
        return result;
        
    }
}
