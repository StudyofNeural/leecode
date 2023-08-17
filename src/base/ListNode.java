package base;

public class ListNode {
    private int value;
    private ListNode next;

    public ListNode() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
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
