class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int n : nums){
            int count = map.getOrDefault(n, 0);
            ans += count;
            map.put(n, count+1);
        }
        return ans;
    }
}
