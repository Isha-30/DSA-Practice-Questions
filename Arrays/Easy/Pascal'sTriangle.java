public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<Integer>();
            
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else
                    row.add(j, allrows.get(i-1).get(j)+ allrows.get(i-1).get(j-1));
                
            }
            
            allrows.add(row);
        }
        return allrows;
    }
}
