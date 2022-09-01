class Solution {
    public void nextPermutation(int[] arr) {
       
        
        int n = arr.length;
        //edge cases
        if(arr.length == 0 || arr == null)
            return;
        //task 1 -> find a[i] < a[i+1]
        int i = n-2;
        while(i>=0 && arr[i] >= arr[i+1])
            i--;
        
        //task 2 -> find arr[j] > arr[i]
        if(i>=0){
            int j = n-1;
            while(j>=0 && arr[j] <= arr[i])
                j--;
            //j found - swap
            swap(arr, i, j);
        }

        //task 3 -> reverse 
        reverse(arr, i+1, n-1);
    }
    
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private void reverse(int[] arr, int low, int high){
        while(low<high)
            swap(arr, low++, high--);
    }
}
