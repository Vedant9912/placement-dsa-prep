class RandomizedSet {
    ArrayList<Integer> arr = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    Random random = new Random();

    public RandomizedSet() {

    }
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,arr.size());
        arr.add(val);
        return true;   
    }
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }


        int i=map.get(val);
        if(i!=(arr.size()-1)){
        int lastelement=arr.get(arr.size()-1);
        arr.set(i,lastelement);
        map.put(lastelement,i);
        }
        arr.remove(arr.size()-1);
        map.remove(val);
        return true;
     
    }
    public int getRandom() {
        int randomInt=random.nextInt(arr.size());
        return arr.get(randomInt);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
