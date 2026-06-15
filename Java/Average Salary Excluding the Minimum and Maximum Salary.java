class Solution {
    public double average(int[] salary) {
        int max=salary[0];
        int min=salary[0];
        for (int num : salary) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            }
        int sum=0;
        for(int  i : salary){
            sum+=i;
        }
        sum-=max+min;
        return (double)sum/(salary.length-2);
        
    }
}
