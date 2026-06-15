class Solution {
    public double averageWaitingTime(int[][] customers) {
        long timePeriod=0;
        long sum=0;
        for(int i =0; i < customers.length ; i++){
            if(timePeriod<customers[i][0]){
                timePeriod+=customers[i][0]-timePeriod;
            }
            timePeriod+=customers[i][1];
            sum+=timePeriod-customers[i][0];
        }
        return (double)sum/customers.length;
    }
}
