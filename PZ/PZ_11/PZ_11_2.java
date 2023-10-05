import java.util.Scanner;
import java.util.HashMap;

public class Main{

    static int numb = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во дней, часов, минут и секунд: ");
        int days = sc.nextInt(); int hours = sc.nextInt(); int minutes = sc.nextInt(); int seconds = sc.nextInt();
        System.out.println("Количество секунд: " + second(days, hours, minutes, seconds));
    }

    static int second(int days, int hours, int minutes, int seconds){
        if(minutes == 0){
            numb += (hours*60*60) + seconds + (days*24*60*60);
            return numb;
        }
        numb += 60;
        return second(days, hours, minutes-1, seconds);
    }
}
