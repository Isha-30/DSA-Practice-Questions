class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        
        for(String email : emails){
            String[] partition = email.split("@");
            String localName = partition[0];
            String domainName = partition[1];
            
            String name = "";
            String[] beforePlus = localName.split("\\+");
            String plus = beforePlus[0];
            
            String[] withoutDot = plus.split("\\.");
            
            if(withoutDot == null || withoutDot.length == 0)
                name += plus;
            else{
                for(int i = 0; i<withoutDot.length; i++){
                    name+=withoutDot[i];
                }
            }
            
            name = name + "@" + domainName;
            if(set.add(name)){
                count++;
                set.add(name);
            }
        }
        return count;
        
    }
}
