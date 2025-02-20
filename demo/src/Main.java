import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {


        ArrayDeque<String> integers = new ArrayDeque<>();
        integers.add("hello");
        integers.add("world");
        System.out.println(integers);
        integers.pop();
        System.out.println(integers);
    }
}