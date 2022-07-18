class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> res = new ArrayList<>();       
        
        Set<Integer> set = new HashSet<>();
        int i = 1;
        while(i < bound){
            int j = 1;
            while(j < bound){
                if(i + j <= bound) set.add(i + j);
                j *= y;
                if(y == 1) break;
            }
            i *= x;
            if(x == 1) break;
        }
        
        res.addAll(set);
        return res;
    }
}
