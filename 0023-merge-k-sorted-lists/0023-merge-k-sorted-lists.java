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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }   
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
            lists.length,
            (a, b) -> Integer.compare(a.val, b.val)
        );
        int listCount = 0;
        int i =0;
        for(ListNode head : lists){
            if(head != null){
                minHeap.add(head);
            }
        }
        ListNode x = new ListNode(0);
        ListNode curr = x;
        
        while(!minHeap.isEmpty()){
            ListNode small = minHeap.poll();
            curr.next = small;
            curr = curr.next;

            if(small.next != null){
                minHeap.add(small.next);
            }
        }

        return x.next;
    }
}