public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int single = 0;
        for(int n : A){
            single ^= n;
        }
        return single;
    }
}
