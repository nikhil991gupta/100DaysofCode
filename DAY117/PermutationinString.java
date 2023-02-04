package DAY117;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map = new int[128];
        for (char c : s1.toCharArray()) {
            map[c]++;
        }
        int count = s1.length();
        char[] chars = s2.toCharArray();
        int left = 0, right = 0;
        while (right < chars.length) {
            if (map[chars[right++]]-- > 0) count--;
            while (count == 0) {
                if (right - left == s1.length()) return true;
                if (++map[chars[left++]] > 0) count++;
            }
        }
        return false;
    }
}
