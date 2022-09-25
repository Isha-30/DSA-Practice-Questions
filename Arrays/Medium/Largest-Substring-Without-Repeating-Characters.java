class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, n = s.length(), res = 0;
        
        while(right<n){
            if(map.containsKey(s.charAt(right)))
                left = Math.max(left, map.get(s.charAt(right))+1); // left if it has moved on 
            
            map.put(s.charAt(right), right);
            res = Math.max(res, right - left+1); // right - left + 1 is range
            right++;
        }
        return res;
    }
}
