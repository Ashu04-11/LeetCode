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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode ans=null;
        ListNode tail=null;
        while(l1!=null && l2!=null){
            int k=l1.val+l2.val+carry;
            ListNode ptr=new ListNode(k%10,null);
            if(ans==null){
                ans=tail=ptr;
            }
            else{
                tail.next=ptr;
                tail=ptr;
            }
            carry=k/10;
            l1=l1.next;
            l2=l2.next;
            
        }
        while(l1!=null){
         int k=(l1.val+carry);
            ListNode ptr=new ListNode(k%10,null);
            if(ans==null){
                ans=tail=ptr;
            }
            else{
                tail.next=ptr;
                tail=ptr;
            }
            carry=k/10;
            l1=l1.next;
        }    
        
       while(l2!=null){
         int k=(l2.val+carry);
            ListNode ptr=new ListNode(k%10,null);
            if(ans==null){
                ans=tail=ptr;
            }
            else{
                tail.next=ptr;
                tail=ptr;
            }
           carry=k/10;
           l2=l2.next;
            
        } 
        if(carry>0){
            ListNode ptr=new ListNode(1,null);
            tail.next=ptr;
        }
        return ans;
    }
}