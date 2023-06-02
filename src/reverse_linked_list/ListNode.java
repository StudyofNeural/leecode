package reverse_linked_list;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
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

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode node = cur.next;
            cur.next = pre;
            pre = cur;
            cur = node;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        for (int i = 2; i <= 5; i++) {
            listNode.add(i);
        }
        ListNode listNode1 = listNode.reverseList(listNode);
        System.out.println(listNode1);
    }
}

