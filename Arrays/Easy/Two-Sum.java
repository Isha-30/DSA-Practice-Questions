class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int rem = target-nums[i];
            if (map.containsKey(target - nums[i])) {
                ans[1] = i;
                ans[0] = map.get(rem);
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
