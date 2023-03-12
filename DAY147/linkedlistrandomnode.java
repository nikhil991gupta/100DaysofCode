package DAY147;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 class Solution {
    private ListNode head;
    private Random random;

    public Solution(ListNode head) {
        this.head = head;
        random = new Random();
    }

    public int getRandom() {
        int count = 0;
        int result = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            // generate a random number between 1 and the count
            // if the random number is 1, update the result with the current node's value
            if (random.nextInt(count) == 0) {
                result = curr.val;
            }
            curr = curr.next;
        }

        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
