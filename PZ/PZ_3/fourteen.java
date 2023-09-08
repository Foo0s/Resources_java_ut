package PZ.PZ_3;
import java.util.Scanner;
public class fourteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа через enter: ");
        int y = sc.nextInt(); int x = sc.nextInt(); int z = sc.nextInt();
        if (y > x && y > z){
            System.out.println(y);
            if (x>z){
                System.out.println(x);
                System.out.println(z);
            }
            else{
                System.out.println(x);
                System.out.println(z);
            }
        }
        else if (x > y && x > z){
            System.out.println(x);
            if (y>z){
                System.out.println(y);
                System.out.println(z);
            }
            else{
                System.out.println(z);
                System.out.println(y);
            }
        }
        if (z > x && z > y){
            System.out.println(z);
            if (x>y){
                System.out.println(x);
                System.out.println(y);
            }
            else{
                System.out.println(y);
                System.out.println(x);
            }
        }
    }
}
