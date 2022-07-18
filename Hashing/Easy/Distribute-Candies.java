class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> type = new HashSet<>();
        for(int candy : candyType){
            type.add(candy);
        }
        if(type.size() <= candyType.length/2)
            return type.size();
        else
            return candyType.length/2;
    }
}
