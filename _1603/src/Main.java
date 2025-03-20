/**
 * @Author 李Muzi
 * @Date 2025/3/15 23:17
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        boolean b = parkingSystem.addCar(1);
        boolean b2 = parkingSystem.addCar(3);
        System.out.println(b);
        System.out.println(b2);
    }
}