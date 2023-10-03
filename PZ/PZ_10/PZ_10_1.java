package PZ.PZ_10;
import java.util.Scanner;

public class PZ_10_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа через пробел: ");
        int x = sc.nextInt(); int y = sc.nextInt(); int z = sc.nextInt();
        geron(x, y, z);
    }
    static void geron(int x, int y, int z){
        int p = (x+y+z) / 2;
        int answer = p*((p-x)*(p-y)*(p-z));
        System.out.println((Math.pow(answer, 0.5) > 0? "Площадь треугольника по формуле герона = " + Math.pow(answer, 0.5): "Не удалось вычислить площадь"));
    }
}
