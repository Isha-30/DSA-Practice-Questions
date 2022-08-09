class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int i = 0, j=len-1;
        for(int a = len-1; a >= 0; a--){
            if(Math.abs(nums[i]) <= Math.abs(nums[j])){
                ans[a] = nums[j] *  nums[j];
                j--;
            }
            else{
                ans[a] = nums[i] * nums[i];
                i++;
            }
        }
        return ans;
    }
}
