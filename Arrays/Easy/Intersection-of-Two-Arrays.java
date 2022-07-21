class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for(int n : nums1)
            set.add(n);
        for(int m : nums2){
            if(set.contains(m))
                ans.add(m);
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
