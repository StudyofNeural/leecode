package delete_append;

import java.util.Stack;

public class CQueue {
    Stack<Integer> a;
    public CQueue() {
        this.a = new Stack<>();
    }

    public void appendTail(int num) {
        a.push(num);
    }

    public int deleteHead() {
        if (!a.isEmpty()) {
            return a.pop();
        }
        return -1;
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
