class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int nonCircular = maxSubarray(nums);
        int total = 0;
        
        for(int i = 0; i<nums.length; i++){
            total += nums[i];
            nums[i] = -nums[i];
        }
        
        int circular = total + maxSubarray(nums);
        if(circular == 0)
            return nonCircular;
        
        return Math.max(circular, nonCircular);
    }
    
    private int maxSubarray(int[] nums){
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            
            if(sum < 0)
                sum = 0;
            
        }
        return maxSum;
    }
}
