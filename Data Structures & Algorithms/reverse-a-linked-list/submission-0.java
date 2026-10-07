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
    public ListNode reverseList(ListNode head) {

        ListNode first = head;
        ListNode last = head;

        //find length
        int k = 0,length = 0;
        while(last!=null)
        {   
            k++;
            last = last.next;
            length++;
        }   

        if(length==0)return head;
        last = head;

        while(true)
        {
            int p = 0;

            while(p<k-1)
            {
                last = last.next;
                p++;
            } 
            //3l,1f,2,0
            //k=3
            //0<2 1
            //1<2 2
            //3,1f,2l,0

            //swap(first.val,last.val); //3,2,1,0
            int temp = last.val;
            last.val = first.val;
            first.val = temp;

            first = first.next; //3,1,2f,0
            last = head; //3l,1,2f,0
            k = k - 1;  //k=2
            if(k<=length/2)return head;
            

        }
        
    }
}
