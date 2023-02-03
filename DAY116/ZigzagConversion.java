



// lets validate the input parameter
//         - If 'numRows' is equal to 1
//             - Return 's'
//     - Create an array of StringBuilders 'sbs'
//         - The indices represent 'row'
//         - The values represent the characters at the row
//     - Create two variables
//         - row, our current row, initially 0
//         - dir, our current direction, initially 0
//     - Iterate through the indices of 's', denoted as 'i'
//         - Retrieve the current character 'c' at index 'i'
//         - Increment 'row' by 'dir'
//         - Append 'c' to 'sbs[row]'
//         - If 'row' is equal to 0, OR 'row' is at the last row (numRows - 1)
//             - If 'dir' is equal to 0
//                 - Set 'dir' to '1'
//             - Else
//                 - Set 'dir' to '-dir'
//     - Now, we are going to convert the array of string builders to a
//       single string
//         - Create a StringBuilder 'result'
//         - Iterate through the 'sbs', denoted as 'sb'
//             - Append 'sb.toString()' to 'result'
//     - Return 'result.toString()'

// What is the Time and Space Complexity?
//     - Time Complexity = O(n) + O(k) = O(n), where 'n' is the length
//       of the input string 's', and 'k' is the number of rows
//         - O(n), visit each character once
//         - O(k), converting array of StringBuilders to 'result'
//     - Space Complexity = O(n) + O(n) = O(n), where 'n' is the length
//        of the input string 's'
//        - O(n), array of StringBuilders
//        - O(n), 'result' string

class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] sbs = new StringBuilder[numRows];
        int row = 0, dir = 0;

        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            row += dir;
            sbs[row].append(c);

            if (row == 0 || row == numRows - 1) {
                dir = (dir == 0) ? 1 : -dir;
            }
        }

        return convert(sbs);
    }

    private String convert(StringBuilder[] sbs) {
        StringBuilder result = new StringBuilder();

        for (StringBuilder sb: sbs) {
            result.append(sb.toString());
        }

        return result.toString();
    }

}