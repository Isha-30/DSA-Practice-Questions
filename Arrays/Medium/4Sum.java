class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int rem = target - nums[j]-nums[i];
                int left = j+1, right = n-1;
                while(left < right){
                    if(nums[left] + nums[right] < rem)
                        left++;
                    else if(nums[left]+nums[right] > rem)
                        right--;
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);
                        //skip duplicates
                        while(left<right && nums[left]==list.get(2))
                            left++;
                        while(left<right && nums[right]==list.get(3))
                            right--;
                    }
                }
                while(j+1 < n && nums[j+1]==nums[j])
                    j++;
            }
            while(i+1<n && nums[i+1]==nums[i])
                i++;
        }
        return ans;
    }
}
