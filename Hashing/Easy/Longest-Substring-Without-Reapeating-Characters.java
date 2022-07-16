public class Solution {
    public int lengthOfLongestSubstring(String A) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, res = 0, n = A.length();
        while(right<n){
            char ch = A.charAt(right);
            if(map.containsKey(ch))
                left = Math.max(left, map.get(ch)+1);
            
            map.put(ch, right);
            res = Math.max(res, right-left+1);
            right++;
        }
        return res;
    }
}
