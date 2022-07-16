class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            
            if(map.containsKey(sch)){
                if(map.get(sch) != tch-'a')
                    return false;
            }
            else{
                if(!map.containsValue(tch-'a'))
                    map.put(sch, tch-'a');
                else
                    return false;
            }
                
        }
        return true;
    }
}
