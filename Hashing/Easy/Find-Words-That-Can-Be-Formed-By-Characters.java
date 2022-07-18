class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : chars.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int ans = 0;
        for(String word : words){
            if(check(map, word))
                ans += word.length();
        }
        return ans;
    }
    
    public boolean check(HashMap<Character, Integer> map, String word){
        HashMap<Character, Integer> clone = (HashMap<Character, Integer> )map.clone();
        for(char letter : word.toCharArray()){
            if(!clone.containsKey(letter) || clone.get(letter)<=0)
                return false;
            else{
                clone.put(letter, clone.get(letter)-1);
            }
        }
        return true;
    }
}
