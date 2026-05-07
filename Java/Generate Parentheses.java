class Generate{
    public static void gen(int index , int total , char[] arr , ArrayList<String> result){
        if (total>arr.length){
            return ;
        }
        if (index==arr.length){
            if (total==0){
                result.add(new String(arr));
            }
            return;
        }
        if (total==-1){
            return;
        }
        arr[index]='(';
        gen(index+1,total+1,arr,result);
        arr[index]=')';
        gen(index+1,total-1,arr,result);
    }
}


class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result= new ArrayList<>();
        char arr[] =new char[n*2];
        Generate.gen(0,0,arr,result);
        return result;


        
    }
}
