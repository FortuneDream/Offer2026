package doublepoint;

import data.ListNode;

//删除链表的倒数第N个节点
//需要一个dummy指针，这样好判断当前位置,以及返回最终结果
//双指针，一前一后。删除指针直接用second.next = second.next.next
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy =new ListNode(0,head);
        ListNode first =head;
        ListNode second =dummy;
        while (n!=0){
            first=first.next;
            n--;
        }
        while (first!=null){
            first = first.next;
            second = second.next;
        }
        second.next=second.next.next;
        ListNode ans =dummy.next;
        return ans;





    }
}
