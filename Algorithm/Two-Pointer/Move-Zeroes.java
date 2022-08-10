class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int m = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[m];
                nums[m] = nums[i];
                nums[i] = temp;
                m++;
            }
        }
    }
}
