//Time Complexity- O(n+m)
// Space complexity- O(1)
//Successfully ran on leetcode

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;
        
        int lenA= 0;
        int lenB=0;
        
        
       ListNode curr= headA;
        while(curr!= null){
            curr= curr.next;
            lenA++;
        }
        curr = headB;
        while(curr!= null){
            curr= curr.next;
            lenB++;
        }
        
        while(lenA> lenB){
            headA= headA.next;
            lenA--;
        }
        
        while(lenB> lenA){
            headB= headB.next;
            lenB--;
        }
        
        while(headA != headB){
            headA= headA.next;
            headB= headB.next;
        }
        
        return headA;
        
    }
}