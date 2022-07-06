public class Solution {
    public int solve(ArrayList<Integer> A) {
        Set<Integer> set = new HashSet<>();
        for(int n : A){
            set.add(n);
        }
        if(set.size() != A.size())
            return 0;
        Stack<Integer> st = new Stack<>();
        int curr = Integer.MIN_VALUE;
        for(int n : A){
            if(n < curr)
                return 0;
            
            while(!st.isEmpty() && st.peek() < n){
                curr = st.pop();
            }
            st.push(n);
        }
        return 1;
    }
}
