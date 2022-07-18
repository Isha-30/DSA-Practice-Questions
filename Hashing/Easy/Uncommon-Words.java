class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : (s1 + " " + s2).split(" "))//join both strings
            count.put(word, count.getOrDefault(word, 0) + 1);
        
        ArrayList<String> res = new ArrayList<>();
        for (String word : count.keySet())
            if (count.get(word) == 1)
                res.add(word);
        return res.toArray(new String[0]);
    }
}
