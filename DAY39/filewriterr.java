import java.io.FileWriter;
import java.io.IOException;

public class filewriterr {
    public static void main(String[] args) throws IOException {
        String source="The smallest element of a binary search tree is the leftmost element of the tree \n" +
                "and the largest element is the rightmost one.\n\n";
        char c;
        char buffer[]=new char[source.length()];
        source.getChars(0,source.length(),buffer,0);
        FileWriter F0=new FileWriter("/Users/nikhikgupta/IdeaProjects/pro1/src/test.dat");
        System.out.println("Length of th String "+source.length());
        for (int i=0;i<buffer.length;i+=2)
        {
            F0.write(buffer[i]);
        }
        F0.close();
        //display values in the buffer ie original string

        FileWriter f1=new FileWriter("/Users/nikhikgupta/IdeaProjects/pro1/src/test1.dat");
        f1.write(buffer);

        f1.close();
        FileWriter f2=new FileWriter("/Users/nikhikgupta/IdeaProjects/pro1/src/test2.dat");
        f2.write(buffer,buffer.length-buffer.length/4,buffer.length/4);


        f2.close();
        int count=0;
        int count1=0;
        int count2=0;
      for(int i=0;i<source.length();i++)
      {
          if(source.charAt(i)=='a'||source.charAt(i)=='e'
                  ||source.charAt(i)=='o'||source.charAt(i)=='i'||source.charAt(i)=='u'||
          source.charAt(i)=='A'||source.charAt(i)=='E'
                  ||source.charAt(i)=='O'||source.charAt(i)=='I'||source.charAt(i)=='U')
          {
              count++;
          }
          else if(source.charAt(i)==' '){
              count2++;


      }
          else {
              count1++;
          }

      }
        System.out.println("vowels "+count);
        System.out.println("consonats "+count1);
        System.out.println("spaces "+count2);

    }
}
