class StockSpanner {
    ArrayList<Integer> arr = new ArrayList<>();
    public StockSpanner() {
                
  }
    
    public int next(int price) {
        arr.add(price);
        int count=1;
        for(int i =arr.size()-2 ; i >=0 ; i--){
            if(arr.get(i)>price){
                return count;
            }
            count++;
        }
        return count;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
