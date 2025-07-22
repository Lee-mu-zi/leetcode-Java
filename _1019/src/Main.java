import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}




class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode cur = head.next;
        List<Integer> list = new ArrayList<>();
        while ( cur != null) {
            cur = cur.next;

        }
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}