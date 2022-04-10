class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();
        //add elements to set
        for(int num : nums){
            set.add(num);
        }
        
        //find consecutive
        for(int num : nums){
            if(!set.contains(num-1)){
                int curr = num;
                int count = 1;
                
                while(set.contains(curr+1)){
                    curr+=1;
                    count+=1;
                }
                longest = Math.max(count, longest);
            }  
        }
        return longest;
    }
}
