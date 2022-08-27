class Solution
{
	int  select(int arr[], int i)
	{
        int minIdx = i;
	    int n = arr.length;   
        for(int j = i+1; j<n; j++){
            if(arr[j] < arr[minIdx])
                minIdx = j;
        }
        
        return minIdx;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i = 0; i<n-1; i++){
	        
	        int min = select(arr, i);
	        
	        int temp = arr[i];
	        arr[i] = arr[min];
	        arr[min] = temp;
	    }
	}
}
