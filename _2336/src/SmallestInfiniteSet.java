import java.util.PriorityQueue;

class SmallestInfiniteSet {
    PriorityQueue<Integer> ini;
    PriorityQueue<Integer> back;


    public SmallestInfiniteSet() {
        ini = new PriorityQueue<>();
        ini.offer(1);
        back = new PriorityQueue<>();
    }
    
    public int popSmallest() {
        Integer poll = ini.poll();
        back.offer(poll);
        ini.offer(poll + 1);
        return poll;
    }
    
    public void addBack(int num) {
        Integer poll = back.poll();
        Integer poll1 = ini.poll();
        if(poll1 >= num) {
            ini.offer(num);
        }
    }
}