package answer;

import dataStructure.ListNode;

public class NO_2_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 !=null) {
            ListNode ans = new ListNode(l2.val);
            ans.next = l2.next;
            return ans;
        } else if (l1 != null && l2 ==null) {
            ListNode ans = new ListNode(l1.val);
            ans.next = l1.next;
            return ans;
        } else if (l1 == null && l2 == null) {
            return null;
        } else {
            ListNode ans;
            int val = l1.val + l2.val;
            if (val >= 10) {
                ans = new ListNode(val - 10) ;
                ListNode next = addTwoNumbers(l1.next, l2.next);
                ans.next = addTwoNumbers(next, new ListNode(1));
            } else {
                ans = new ListNode(val) ;
                ans.next = addTwoNumbers(l1.next, l2.next);
            }
            return ans;
        }


    }

}
