import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        car c = new car();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние:");
        path nv = new path(sc.nextInt(), c);
        nv.run();
    }
}