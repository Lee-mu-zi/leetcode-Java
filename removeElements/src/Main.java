

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        int val = 6;
        Solution solution = new Solution();
        solution.removeElements(head,val);
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //判断链表头结点是否为空，不存在直接返回
        if(head == null){
            return head;
        }

        /**
         * 若果当前结点不为空，并且值等于val，直接删除当前节点
         * 删除节点的方法，直接将链表的头结点改为当前头结点的下一位，head.next
         * 因为是while循环，所以会一直循环到head头结点不是目标值的时候才会停下
         */
        while (head != null && head.val == val) {
            head = head.next;
        }

        /**
         * 设置前一个结点和当前节点的值
         */
        ListNode pre = head;
        ListNode cur = head.next;

        //如果cur没有指向null 一直循环判断
        while (cur != null){
            if(cur.val == val) {
                //当当前值为目标值的时候，删除当前结点，pre的后继结点改为cur的后继结点
                pre.next = cur.next;
            } else {
                //如果不符合目标值，将pre更改为cur，继续向后判断
                pre = cur;
            }
            //此时cur不等于目标值，并且pre已经更改完成，将cur的值也更改，准备进行下次判断
            cur = cur.next;
        }
        return head;
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
