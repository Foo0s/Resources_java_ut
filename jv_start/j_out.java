package jv_start;
import java.util.Scanner;

public class j_out {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //Сканер, служит для ввода.
        int number = scan.nextInt(); /*Ожидается ввод от пользователя - число.*/

        if (number > 18 && number < 70){
            System.out.println("Вход разрешен.");
        }
        else if (number  > 70){
            System.out.println("Вход запрещен.");
        }
        else{
            System.out.println("Ваш возраст " + number + ", слишком мал.");
        }
    }
}

