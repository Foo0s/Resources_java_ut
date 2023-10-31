import javax.lang.model.type.ErrorType;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите арифмитическое выражение (PS: + - * /): ");
        String arifm = sc.nextLine();
        String arifm_operators = "+-/*";

        String[] array_oper = arifm.split(" ");
        try{
            int numb1 = Integer.parseInt(array_oper[0]);
            int numb2 = Integer.parseInt(array_oper[2]);
            String arifm_operator = array_oper[1];

            if (arifm_operators.contains(arifm_operator) == false) {
                throw new NullPointerException("Operation Error!");
            }
            else{
                switch (arifm_operator){
                    case "+": System.out.println(numb1+numb2); break;
                    case "-": System.out.println(numb1-numb2); break;
                    case "*": System.out.println(numb1*numb2); break;
                    case "/": System.out.println(numb1/numb2); break;
                }
            }
        }
        catch (NumberFormatException  ex) {
            System.out.println("Error! Not number");
        } catch (ArithmeticException e) {
            System.out.println("Error!Division by Zero");
        }
    }
}
