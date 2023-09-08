package PZ.PZ_3;
import java.util.Scanner;

public class one{
    public static void main(String[] args){
        Scanner ns = new Scanner(System.in);
        System.out.println("Введите 3 строки через Enter: ");
        String one = ns.nextLine();
        String two = ns.nextLine();
        String three = ns.nextLine();
        System.out.println( (one.equals(two) && one.equals(three) && two.equals(three))? "Yes" : "No");
    }
}
