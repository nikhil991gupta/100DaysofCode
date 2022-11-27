package DAY48;

public class addbinarystrings {
    String addBinary(String A, String B) {
        // code here
         java.math.BigInteger a=new java.math.BigInteger(A,2);
        java.math.BigInteger b= new java.math.BigInteger(B,2);
         a=a.add(b);
         return a.toString(2);
    }
    
}
