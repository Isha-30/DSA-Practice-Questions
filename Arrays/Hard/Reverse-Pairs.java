class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    
    private int mergeSort(int[] arr, int low, int high){
        if(low >= high)
                return 0;
        
        int mid = (low+high)/2;
        int ans = mergeSort(arr, low, mid);
        ans += mergeSort(arr, mid+1, high);
        ans += merge(arr, low, mid, high);
        return ans;
    }
    
    private int merge(int[] nums, int low, int mid, int high){
        int count = 0, j = mid+1;
        for(int i = low; i<= mid; i++){
            while(j<=high && nums[i] > 2*(long)nums[j]){
                j++;
            }
            count += j-(mid+1);
        }
        
        ArrayList<Integer> merged = new ArrayList<>();
        int left = low, right = mid+1;
        while(left <= mid && right <=high){
            if(nums[left] <= nums[right])
                merged.add(nums[left++]);
            else
                merged.add(nums[right++]);
        }
        while(left <= mid)
            merged.add(nums[left++]);
        while(right<=high)
            merged.add(nums[right++]);
        
        for(int i = low; i<=high; i++){
            nums[i] = merged.get(i-low);
        }
        return count;
    }
}
