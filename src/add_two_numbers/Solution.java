package add_two_numbers;

import base.ListNode;

/**
 * 2. 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * <p>
 *
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 * <p>
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = calculateNumber(l1, 0);
        int num2 = calculateNumber(l2, 0);
        return calNode(num + num2);
    }

    private ListNode calNode(int result) {
        ListNode listNode = new ListNode();
        nextNode(result, listNode);
        return listNode;
    }

    private ListNode nextNode(int tmp, ListNode node) {
        while (tmp > 10) {
            node.setValue(tmp % 10);
            tmp = tmp - tmp / 10;
            node.setNext(nextNode(tmp, new ListNode()));
        }
        return node;
    }

    private int calculateNumber(ListNode l1, int digit) {
        while (l1.getNext() != null) {
            calculateNumber(l1.getNext(), digit++);
        }
        return (int) (l1.getValue() * Math.pow(10, digit));
    }

}
