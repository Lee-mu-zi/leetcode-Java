import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        boolean add = integers.add(1);
        boolean add1 = integers.add(1);
        System.out.println(add);
        System.out.println(add1);
    }
}