class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length, res[] = new int[n];
        
    Map<Integer, Integer> map = new HashMap<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) != map.get(b) ? map.get(b) - map.get(a) : a - b);
    //heap will remove elements with higher frequency first
    //if two or more elements have same frequency then smaller element will get removed first
     
    for(int e : nums)
        map.merge(e, 1, Integer::sum);
      
    pq.addAll(map.keySet());
        
    while(n > 0){
        int curr = pq.poll();
        int freq = map.get(curr);
        while(freq-- > 0)
            res[--n] = curr;
    }
    return res;
    }
    
}
