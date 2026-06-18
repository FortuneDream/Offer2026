package linked;

import data.ListNode;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){ //利用快展指针找到中间值
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode q = null ;
        ListNode p = slow;
        while (p!=null){   //翻转
            ListNode r= p.next;
            p.next = q;
            q = p;
            p = r;
        }
        p=head;
        while(q!=null){//判断是否为回文
            if(q.val!=p.val)return false;
            q=q.next;
            p=p.next;
        }

        return true;

    }
}
