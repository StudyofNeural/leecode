package base;

import java.util.List;

public class ListNode {
    int val;
    private ListNode next;

    public ListNode() {
    }


    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void add(int val) {
        if (this.next == null) {
            this.next = new ListNode(val);
        } else {
            this.next.add(val);
        }
    }

    public ListNode getNext(ListNode head) {
        return head.next;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
