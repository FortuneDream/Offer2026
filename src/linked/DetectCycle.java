package linked;

import data.ListNode;

//环形链表 2
// 先找到成环位置，然后新增一个ptr=head，再来一圈，找到slow = ptr
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;
            if (fast==slow){
                ListNode ptr = head;
                while (ptr!=slow){ //再来一圈
                    ptr =ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
