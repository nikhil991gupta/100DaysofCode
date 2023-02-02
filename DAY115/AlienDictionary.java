package DAY115;

class Solution {
    int[] table;    // table[alien] = order
    
    public boolean isAlienSorted(String[] words, String order) {
        // Create the mapping table
        table = new int[26];
        for(int i = 0; i < order.length(); i++) {
            table[order.charAt(i) - 'a'] = i;
        }
        
       // Copmare adjacent words
        for(int i = 0; i < words.length - 1; i++) {
            if(isBigger(words[i], words[i + 1])) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isBigger(String s1, String s2) {
        // Compare the common parts
        int length = Math.min(s1.length(), s2.length());
        for(int i = 0; i < length; i++) {
            // Find the first difference
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != c2) return table[c1 - 'a'] > table[c2 - 'a'];
        }
        
        // If no difference in common parts, check the length in case s1 = "apple", s2 = "app"
        return s1.length() > s2.length();
    }
}
