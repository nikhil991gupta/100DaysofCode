package DAY112;

class Solution {
    public String reverseWords(String s) {

    //      int left=0;
    //    int right=0;
    //            char[] c=s.toCharArray();

    //     while(left<s.length()){
    //     //    char temp=s[left];
    //     //     s[left++]=s[right];
    //     //     s[right--]=temp;
    //     while(right<s.length() && c[right]!=' ')
    //     {
    //         right++;
    //         int right1=c.length -1;
    //         while(left<right1){
    //        char temp=c[left];
    //         c[left++]=c[right1];
    //         c[right1--]=temp;
            

    //     }
    //     }

        
    // }
    // return s;

    StringBuilder s1= new StringBuilder();
    String[] words=s.split(" ");
    for(int i=0;i<words.length;i++)
    {

        for(int j=words[i].length()-1;j>=0;j--)
        {
            s1.append(words[i].charAt(j));
        }
        s1.append(" ");
    }
    return s1.toString().trim();
    }
}