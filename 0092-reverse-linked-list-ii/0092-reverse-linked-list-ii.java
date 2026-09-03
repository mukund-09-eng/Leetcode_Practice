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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer>list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        int l = left -1;
        int r = right -1;
        while(l<r){
            int temp = list.get(l);
            list.set(l , list.get(r));
            list.set(r,temp);
            l++;
            r--;
        }
        curr = head;
        int i =0;
        while(curr !=null){
            curr.val = list.get(i++);
            curr = curr.next;
        }
        return head;
    }
}