package DAY51;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class javamap {

    private static Scanner inputScanner;

    public static void main(String[] args) {
        /* Create a phone book Map */
        Map<String, String> phoneBook = new HashMap<String, String>();
        /* Create the input Scanner instance */
        inputScanner = new Scanner(System.in);
        
        /* Read the number of input phone numbers */
        int numFriends = inputScanner.nextInt();
        /* Go to the next line of input */
        inputScanner.nextLine();
        
        /* Loop thru the number of friends, reading the name and phone number, and adding to the phoneBook */
        for (int i = 0; i < numFriends; i++) {
            /* Read the name of the friend */
            String name = inputScanner.nextLine();
            /* Read the phone number */
            String phone = inputScanner.nextLine();
            /* Put the name and phone number into the phoneBook */
            phoneBook.put(name, phone);
        }

        /* Loop while there is still more input data */
        while (inputScanner.hasNext()) {
            /* Read the person to search for a phone number */
            String inputName = inputScanner.nextLine();

            /* Does the name exist in the phone Book */
            if (phoneBook.containsKey(inputName)) {
                /* Yes, print out the name and phone number */
                System.out.println(inputName + "=" + phoneBook.get(inputName));
            } else {
                /* Print out error message if not found */
                System.out.println("Not found");
            }

        }

    }

}
/*
 ....................................OUTPUT........................................................................
 * Compiler Message
Success
Input (stdin)

Download
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Expected Output

Download
uncle sam=99912222
Not found
harry=12299933
 ..............................................................................................................................
 */