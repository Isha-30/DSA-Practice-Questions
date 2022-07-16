class Solution {
    public int[] frequencySort(int[] nums) {
        int[] ans = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
           public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2){
               if(e1.getValue() == e2.getValue())
                   return e2.getKey() - e1.getKey();
               else
                   return e1.getValue() - e2.getValue();
           } 
        });
        
        int i = 0;
        for (Map.Entry<Integer, Integer> e : list) {
            int val = e.getValue();
            while(val > 0) {
                ans[i] = e.getKey();
                i++;
                val--;
            }
        }
        return ans;
    }
    
}
