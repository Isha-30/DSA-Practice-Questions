class Solution {
    public int trap(int[] height) {
        int n = height.length;
       //pointers
        int left = 0, right = n-1;
        int ans = 0;
        //left greater and right greater
        int leftMax = 0, rightMax = 0;
        
        while(left < right){
            //condition 1 -> height[left] < height[right]
            if(height[left]< height[right]){
                if(height[left] >= leftMax)
                    leftMax = height[left];
                else
                    ans += (leftMax-height[left]);
                left++;
            }
            //conditon 2 -> height[right] < height[left]
            else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }
                else
                    ans += (rightMax - height[right]);
                right--;
            }
        }
        return ans;
    }
}
