class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(int i = 0; i<s.length()-9; i++){
            String subStr = s.substring(i, i+10);
            map.put(subStr, map.getOrDefault(subStr, 0)+1);
            if(map.get(subStr) == 2)
                ans.add(subStr);
        }
        return ans;
    }
}
