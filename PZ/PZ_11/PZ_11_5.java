import java.util.Scanner;


public class Main
{
    public static int count = 0;
    public static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во ступенек: ");
        int x = sc.nextInt(); sc.nextLine();
        System.out.println("На какой ступеньке находится мячик: "); int m_x = sc.nextInt(); sc.nextLine();
        System.out.println(bools(x, m_x));
    }
    
    static int bools(int x, int y) {
        while (y > 0) {
            count++;
            if (y-2 > 0) count++;
            if (y-3 > 0) count++;
            return bools(x-1, y-1);        
        }
        return count;
    }
}
