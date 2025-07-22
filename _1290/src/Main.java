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
    public int getDecimalValue(ListNode head) {
        ListNode ptr = head;
        StringBuilder sb = new StringBuilder();
        while (ptr != null) {
           sb.append(ptr.val);
           ptr = ptr.next;
        }
        return Integer.valueOf(sb.toString(),2);
    }
}