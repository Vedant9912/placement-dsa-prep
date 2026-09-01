class Solution {
    public int brokenCalc(int startValue, int target) {
        if(target==startValue) return 0;
        int count=0;
        while(target>startValue){
        if(target%2!=0){
            count++;
            target++;
        }
        target/=2;
        count++;
        }
        count+=startValue-target;
        return count;
        
    }
}
