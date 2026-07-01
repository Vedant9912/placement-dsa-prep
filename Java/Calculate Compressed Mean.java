class Solution {
    public double calculateCompressedMean(int[] quantities) {
        int sum = 0;
        for(int i = 0 ; i < quantities.length ; i++){
            sum+=quantities[i];
        }
        return (double)sum/quantities.length;
    }
}
