package linked;

import data.ListNode;

//两个反向链表数相加，直接加同时补零
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head =new ListNode(0);
        ListNode cur =head;
        int carry = 0;
        while (l1!=null||l2!=null){
            int v1= l1==null?0:l1.val;
            int v2= l2==null?0:l2.val;
            int sum = (v1+v2+carry)%10;
            carry = (v1+v2+carry)/10;
            cur.next= new ListNode(sum);
            cur=cur.next;
            if (l1!=null){
                l1 = l1.next;
            }

            if (l2!=null){
                l2 = l2.next;
            }

        }
        if (carry ==1){
            cur.next=new ListNode(1);
        }
        return head.next;
    }
}
