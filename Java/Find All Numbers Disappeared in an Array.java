class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length];
        List<Integer> result= new ArrayList<>();
        for(int i : nums){
            arr[i-1]=i;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                result.add(i+1);

            }
        }
        return result;
    }
}
