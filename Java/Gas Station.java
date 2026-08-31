class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int mygas=0;
        int start=0;
        int gsum=0;
        int csum=0;

        for(int i = 0 ; i < gas.length ; i++ ){

            mygas+=gas[i];
            mygas-=cost[i];
            if(mygas<0){
                mygas=0;
                start=i+1;
            }

            gsum+=gas[i];
            csum+=cost[i];

        }
        if(gsum<csum) return -1;
        return start;
        
    }
}
