class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum=0;
        for(int i = 0 ; i < tickets.length ; i++){
            sum+=tickets[i];
        }
        for(int i=0 ; i<k ; i++){
            if(tickets[i]>tickets[k]){
                sum-=tickets[i]-tickets[k];

            }
        }
        for(int i=k+1 ; i<tickets.length ; i++){
            if(tickets[i]>=tickets[k]){
                sum-=tickets[i]-tickets[k]+1;

            }
            
        }
        return sum;
        
    }
}
