/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        int len = 1;
        ListNode noDuplicate = new ListNode(head.val);
        ListNode currHead = head.next;
        while (currHead != null) {
            ListNode currNode = noDuplicate;
            boolean hasFoundDup = false;
            for(int i = 0; i < len; i++) {
                if (currHead.val == currNode.val) {
                    hasFoundDup = true;
                    break;
                }
                if (i!=len-1) {
                   currNode = currNode.next;
                }
            }
            if (! hasFoundDup ) {
                currNode.next = new ListNode(currHead.val);
                len++;
            }
            currHead = currHead.next;
        }
        head.next = noDuplicate.next;
        return head;
    }
}
