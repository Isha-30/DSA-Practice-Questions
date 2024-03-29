class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(char jewel : jewels.toCharArray()){
            set.add(jewel);
        }
        int count = 0;
        for(char stone : stones.toCharArray()){
            if(set.contains(stone))
                count++;
        }
        return count;
    }
}
