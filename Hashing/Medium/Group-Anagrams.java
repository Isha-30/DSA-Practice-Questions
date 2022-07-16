class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String st : strs){
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(st);;
        }
        return new ArrayList<>(map.values());
    }
}
