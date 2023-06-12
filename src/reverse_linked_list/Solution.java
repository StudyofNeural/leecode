package reverse_linked_list;

import base.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode node = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = node;
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode();
        for (int i = 2; i <= 5; i++) {
            listNode.add(i);
        }
        ListNode solution1 = solution.reverseList(listNode);
        System.out.println(solution1);
    }
}

