class ProductOfNumbers {
    int product=1;
    ArrayList<Integer> arr = new ArrayList<>();
    public ProductOfNumbers() {

       
    }
    
    public void add(int num) {
        if(num==0){
            arr.clear();
            product=1;
        }
        else{
        product*=num;
        arr.add(product); }

        
        


        
    }
    
    public int getProduct(int k) {
        if(k>arr.size()) return 0;
        if(k == arr.size()) return arr.get(arr.size()-1);
        int left = arr.size()-1-k;

        return arr.get(arr.size()-1)/arr.get(left);
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
