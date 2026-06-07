class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char num : s.toCharArray()){
            map.put(num,map.getOrDefault(num,0)+1);}
        
        List <Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<list.size() ;i++){
            int j =list.get(i).getValue();
            while(j!=0){
                sb.append(list.get(i).getKey());
                j--;
            }

        }
        return new String(sb);
        
    }
}
