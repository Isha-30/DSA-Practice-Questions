class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] ans = new int[nums.length];
        for(int n : nums){
            pq.add(n);
        }
        
        while(!pq.isEmpty()){
            map.put(pq.poll(), pq.size());
        }
        for(int i = 0; i<nums.length; i++){
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}
