package PZ.PZ_3;
import java.util.Scanner;

public class twelve {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число коров: ");
        int k = sc.nextInt();
        if (k % 10 == 1 && (k != 11)){
            System.out.println(k +" корова");
        }
        else if ( k % 10 <= 4 && k%10 >= 2){
            System.out.println(k + " коровы");
        }
        else{
            System.out.println(k + " коров");
        }
    }
}
