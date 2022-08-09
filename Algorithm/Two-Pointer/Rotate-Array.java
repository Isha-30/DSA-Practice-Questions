class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length < 2){
            return;
        }
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n- 1);
        reverse(nums, 0, n - 1);
    }
    
    private void reverse(int[] nums, int i, int j){
        int tmp = 0;       
        while(i < j){
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}
