class Solution {
    public void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length-1;
        
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
