package linked;

import data.ListNode;

import java.util.HashSet;
import java.util.Set;

public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode  headB){
        Set<ListNode> set =new HashSet<>();
        ListNode newHeadA = headA;
        while (newHeadA!=null){
            set.add(newHeadA);
            newHeadA=newHeadA.next;
        }

        ListNode newHeadB = headB;
        while (newHeadB!=null){
            if (set.contains(newHeadB)){
                return  newHeadB;
            }
            newHeadB = newHeadB.next;
        }

        return null;

    }
}
