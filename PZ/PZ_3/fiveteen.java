package PZ.PZ_3;
import java.util.Scanner;

public class fiveteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String answer = "";
        if (number >= 1 && number <= 100){
            if (number >= 90){
                answer += "XC";
                number -= 90;
            }
            if (number > 60){
                answer += "LX";
                number -= 60;
            }
            if (number >= 40){
                answer += "XL";
                number -= 40;
            }
            if (number >= 50){
                answer += "L";
                number -= 50;
            }
            if (number < 40){
                answer += "X".repeat(number/10);
                number -= 10*(number/10);
            }
            if (number == 9){
                answer += "IX".repeat(number/9);
                number -= 9;
            }
            if (number >= 5){
                answer += "V".repeat(number/5);
                number -= 5*(number/5);
            }
            if (number == 4){
                answer += "IV";
                number -= 4;
            }
            else{
                answer += "I".repeat(number);
                number -= number;
            }
        }
        System.out.println(answer);
    }
}

