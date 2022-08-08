class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){// means if strs[i] is not the same as prefix or does not contain prefix then it return -1, thus we enter the loop and remove 1 letter from the end to check again till we reach a point where the two strings are either same or one contains other.
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
