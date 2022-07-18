class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map= new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        for(char ch : text.toCharArray()){
            if(ch == 'b' || ch=='a' || ch=='l' || ch=='o' || ch=='n')
                map.put(ch, map.get(ch)+1);
        }
        int min = map.get('b');
        min = Math.min(min, map.get('a'));
        min = Math.min(min, map.get('l')/2);
        min = Math.min(min, map.get('o')/2);
        min = Math.min(min, map.get('n'));
        return min;      
    }
}
