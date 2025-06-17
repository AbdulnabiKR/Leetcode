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
         ListNode temp1=l1;//to traverse along the linkedlist1
         ListNode temp2=l2;//to traverse along the linkedlist2
         ListNode dummyNode=new ListNode(0);//if want to change the head value i a list then it is a very easy method to get head or easy method toc change the head value
         ListNode curr=dummyNode;
         int carry=0;
         while(temp1!=null||temp2!=null){
            int sum=carry;
            if(temp1!=null){
             sum+=temp1.val;
               temp1=temp1.next;
            }
             if(temp2!=null){
                sum+=temp2.val;
                 temp2=temp2.next;
             }
             ListNode newNode=new ListNode(sum%10);//to get the value in sumlist
             carry=sum/10;//to know the carry whether 0 or 1
             curr.next=newNode;
             curr=curr.next;
         }
          //at the end of sumlist if carry 1 is remained 
                 if(carry>0){
                    ListNode newNode=new ListNode(carry);
                    curr.next=newNode;
                 }
          return dummyNode.next;
    }
}