class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        long n= arr.length;
        long sum =0;
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i)){
                result.add(i);
            }
            set.add(i);
            sum+=i;
        }
        result.add((int)(n*(n+1)/2 - sum + result.get(0)));
        return result;
        
    }
}
