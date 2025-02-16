import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.merge(1,-2,(a,b)->a+b);

        System.out.println(map);
    }
}