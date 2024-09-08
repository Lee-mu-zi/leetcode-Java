public class Main {
    public static void main(String[] args) {
//        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
//        circularQueue.enQueue(1);  // 返回 true
//        circularQueue.enQueue(2);  // 返回 true
//        circularQueue.enQueue(3);  // 返回 true
//        circularQueue.enQueue(4);  // 返回 false，队列已满
//        circularQueue.Rear();  // 返回 3
//        circularQueue.isFull();  // 返回 true
//        circularQueue.deQueue();  // 返回 true
//        circularQueue.enQueue(4);  // 返回 true
//        circularQueue.Rear();  // 返回 4
    }
}

class MyCircularQueue {
    private int front;
    private int rear;
    private int capacity;
    private int[] elements;

    public MyCircularQueue(int k) {
        capacity = k + 1;
        elements = new int[capacity];
        rear = front = 0;
    }

//    public boolean enQueue(int value) {
//
//    }
//
//    public boolean deQueue() {
//
//    }
//
//    public int Front() {
//
//    }
//
//    public int Rear() {
//
//    }
//
//    public boolean isEmpty() {
//
//    }
//
//    public boolean isFull() {
//
//    }
}

