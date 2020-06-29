package solution.linkedlist;

import dataStructure.ListNode;

/**
 * @author admin
 * @date 2020/6/28
 */
public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode copy = answer;
        int i = 0;
        while (l1 != null || l2 != null || i > 0) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int val = val1 + val2 + i;

            i = val / 10;
            val %= 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            copy.next = new ListNode(val);
            copy = copy.next;
        }
        return answer.next;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        int val = l1.val + l2.val;
        int i = val / 10;
        val %= 10;

        if (i > 0) {
            if (l1.next == null) {
                l1.next = new ListNode(i);
            } else if (l2.next == null) {
                l2.next = new ListNode(i);
            } else {
                l1.next.val += 1;
            }
        }


        ListNode listNode = new ListNode(val);
        listNode.next = addTwoNumbers1(l1.next, l2.next);
        return listNode;
    }


}
