public class Main {
    public static void main(String[] args) {

        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        int pop = obj.pop();
        int pop2 = obj.pop();
        System.out.println(pop);
        System.out.println(pop2);
    }
}