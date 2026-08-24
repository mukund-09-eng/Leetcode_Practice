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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        int lenA = 0;
        int lenB =0;
        while(currA!=null){
            lenA++;
            currA = currA.next;
        }
        while(currB!=null){
            lenB++;
            currB = currB.next;
        }
        currA = headA;
        currB = headB;

        while(lenA>lenB){
            currA = currA.next;
            lenA--;
        }
        while(lenB>lenA){
            currB=currB.next;
            lenB--;
        }

        while(currA!=currB){
            currA=currA.next;
            currB = currB.next; 
        }
        return currA;
    }
}