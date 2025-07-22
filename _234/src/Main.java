public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
        }
        int[] ints = new int[len];
        for (int i = 0; i < len; i++) {
            ints[i] = head.val;
            head = head.next;
        }

    }
}