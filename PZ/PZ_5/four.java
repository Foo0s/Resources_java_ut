package PZ.PZ_5;
import java.util.Scanner;

public class four {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите кол-во человек: ");
        int numb_human = s.nextInt();
        int[] all_h = new int[numb_human];
        for (int i = 0; i < numb_human; i++){
            System.out.println("Введите рост человека (sm): ");
            all_h[i] = s.nextInt();
        }
        System.out.println("Введите ваш рост: ");
        int h_h = s.nextInt();
        for (int x = 0; x < numb_human; x++){
            if (all_h[x] > h_h){
                System.out.println("Номер под которым Петя должен встать в строй: " + x);
                break;
            }
            else if (all_h[x] == h_h){
                System.out.println("Номер под которым Петя должен встать в строй: " + (x-1));
                break;
            }
        }
    }
}
