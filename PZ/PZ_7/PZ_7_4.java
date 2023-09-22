package PZ.PZ_7;
import java.util.Scanner;

public class PZ_7_4 {
    public static void main(String[] args){
        /*
            Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
            На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.
            Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.
        */
        Scanner ns = new Scanner(System.in);
        System.out.println("Введите IP адрес: ");
        String ip_adress = ns.nextLine();
        String[] array_numb_ip = ip_adress.split("\\."); int score = 0;
        if (array_numb_ip.length == 4){
            for(int i = 0; i < array_numb_ip.length; i++) {
                int numb = Integer.parseInt(array_numb_ip[i]);
                if (numb <= 255) score++;
                else{
                    System.out.println("NO");
                    break;
                }
            }
            if (score == 4) System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
