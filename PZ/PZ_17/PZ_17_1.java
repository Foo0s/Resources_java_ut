package PZ.PZ_17;
import javax.lang.model.type.ErrorType;
import java.util.Scanner;
import java.util.ArrayList;

public class PZ_17_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите арифмитическое выражение (PS: + - * /): ");
        String arifm = sc.nextLine();
        String arifm_operators = "+-/*";
        boolean flag = true;

        String[] array_oper = arifm.split(" ");
        try{
            int numb1 = Integer.parseInt(array_oper[0]);
            int numb2 = Integer.parseInt(array_oper[2]);
            String arifm_operator = array_oper[1];

            if (arifm_operators.contains(arifm_operator) == false) {
                throw new Exception();
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
            flag = false;
        } catch (ArithmeticException e) {
            System.out.println("Error!Division by Zero");
            flag = false;
        } catch (Exception e) {
            System.out.println("Operation Error!");
            flag = false;
        }
        finally{
            if (flag == true) {
                System.out.println("Вычисление произошло успешно");
            }
            else {
                System.out.println("Вычисление не произошло");
            }
        }
    }
}
