class CombinationSum{
    public static void gen(int index,int total,List<Integer>subset,List<List<Integer>> result , int[] candidates, int target){
        if (total==target){
            result.add(new ArrayList<>(subset));
            return;
        }
        else if(total>target){
            return;
        }
        if(index>=candidates.length){
            return;
        }
            subset.add(candidates[index]);
            gen(index,total+candidates[index],subset,result,candidates,target);
            subset.remove(subset.size()-1);
            gen(index+1,total,subset,result,candidates,target);
    
    }
}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        int index=0;
        int total=0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        CombinationSum.gen(index,total,subset,result,candidates,target);
        return result;
    }
}
