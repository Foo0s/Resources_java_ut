package PZ.PZ_3;
import java.util.Scanner;

public class four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время (число) в часах, которое запланировано: ");
        int time = sc.nextInt();
        System.out.println("Введите время (число) в минутах, которое запланированно: ");
        int time_m = sc.nextInt();
        System.out.println("Введите время которые сейчас показывают часы (в часах): ");
        int time_now = sc.nextInt();
        if (time+(double)time_m/ 100 >= time_now) System.out.println("Успел");
        else System.out.println("Опоздал");
        System.out.println(time+(double)time_m / 100);
    }
}
