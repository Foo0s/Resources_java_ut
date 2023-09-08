package PZ.PZ_3;
import java.util.Scanner;

public class eleven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 стороные треугольника через enter: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x+y > z || x+z > y || y+z > x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
