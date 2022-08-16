class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int curr = 0, sum = 0;
        int len = nums.length;
        
        for(int i = 1; i<len-1; i++){
            if(nums[i] - nums[i-1] == nums[i+1]-nums[i]){
                curr += 1;
                sum += curr;
            }
            else
                curr = 0;
        }
        return sum;
    }
}
