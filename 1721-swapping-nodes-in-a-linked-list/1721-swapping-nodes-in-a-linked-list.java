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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode last = head;
        ListNode tmp = head;

        for(int i = 1; i < k; i++){
            first = first.next;
        }
        tmp = first;
        while(tmp.next != null){
            tmp = tmp.next;
            last = last.next;
        }
        int val = first.val;
        first.val = last.val;
        last.val = val;
        return head;

    }
}