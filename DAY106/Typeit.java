package DAY106;

class Solution {
    int minOperation(String s) {
        int ans=s.length();
        char[] c=s.toCharArray();
        for(int i=0;i<s.length()/2;i++) {
           if(s.substring(0,i+1).equals(s.substring(i+1,i+i+2)))ans = s.length()-i;
        }
        return ans;
    }
}
