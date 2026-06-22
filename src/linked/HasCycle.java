package linked;

import data.ListNode;

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast =head.next;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast =fast.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

}
