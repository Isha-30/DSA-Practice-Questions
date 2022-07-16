public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : A){
            map.put(n, map.getOrDefault(n, 0) + 1);
            if(map.get(n) == 3)
                map.remove(n);
        }
        int[] arr = new int[1];
        for(int n : map.keySet()){
            arr[0] = n;
        }
        return arr[0];
    }
}
