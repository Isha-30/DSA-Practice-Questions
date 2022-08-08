class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        return binarySearch(nums, target, 0, len-1);
    }
    
    private int binarySearch(int[] nums, int x, int l, int r){
        if(l>r)
            return -1;
        int mid = l + (r-l)/2;
        if(x == nums[mid])
            return mid;
        else if(x > nums[mid])
            return binarySearch(nums, x, mid+1, r);
        else
            return binarySearch(nums, x, l, mid-1);
    }
}
