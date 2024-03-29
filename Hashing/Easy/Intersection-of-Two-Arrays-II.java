class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int n : nums1)
            map.put(n, map.getOrDefault(n, 0)+1);
        
        for(int n : nums2){
            if(map.containsKey(n) && map.get(n)!=0){
                ans.add(n);
                map.put(n, map.get(n)-1);
            }  
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
