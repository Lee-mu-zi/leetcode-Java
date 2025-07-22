public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class ListNode {
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
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        ListNode prev = new ListNode(0);
        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
                prev.next = curr.next;
            } else {
                curr = curr.next;
                prev = curr;
            }
        }
        return prev.next;
    }
}