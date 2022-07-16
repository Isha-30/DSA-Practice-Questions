public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A){
        HashSet<Integer> hs = new HashSet<Integer>();
        int max = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > 0) {
                hs.add(A.get(i));
                if (A.get(i) > max) {
                    max = A.get(i);
                }
            }
        }
        if (max > 0) {
            for (int i = 1; i <= max+1; i++) {
                if (!hs.contains(i)) {
                    return i;
                }
            }
        }
        return 1; 
    }
}
