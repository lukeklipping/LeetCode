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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0, head);
        ListNode node = tmp;
        ListNode target = tmp;
        for(int i = 0; i <= n; i++){
            node = node.next;
        }
        
        while(node != null){
            node = node.next;
            target = target.next;
        }
        target.next = target.next.next;
        return tmp.next;
    }   
}