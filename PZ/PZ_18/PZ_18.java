package PZ.PZ_18;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

class PZ_18{
    public static void main(String[] argc) throws IOException {
        /*
            Практическая работа №18.
            Чтение и запись данных в файл.
        */
        System.out.println("Введите арифмитическое выражение: ");
        Scanner sc = new Scanner(System.in);
        String[] string_arg = sc.nextLine().split(" ");
        ArrayList<String> symbol_to_operations = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
        String finally_answer = null;
        try{
            int number_operation_1 = Integer.parseInt(string_arg[0]);
            int number_operation_2 = Integer.parseInt(string_arg[2]);
            int result = 0;
            String symbol_operation = string_arg[1];

            if (string_arg.length > 3) {
                throw  new Error();
            }

            if (symbol_to_operations.contains(symbol_operation) == true) {
                switch (symbol_operation){
                    case "+": result += (number_operation_1 + number_operation_2); break;
                    case "-": result += (number_operation_1 - number_operation_2); break;
                    case "*": result += (number_operation_1 * number_operation_2); break;
                    case "/": result += (number_operation_1 / number_operation_2); break;
                }
            }
            else{
                throw new Exception();
            }

            System.out.println("1 - Чтение файла. 2 - Запись данных в файл.");
            int choice = sc.nextInt();
            try{
                if (choice == 1) {
                        FileReader fl_read = new FileReader("input.txt");
                        char[] str = new char[256];
                        int symbol;
                        while((symbol = fl_read.read(str)) > 0) {
                            if (symbol < 256) {
                                str = Arrays.copyOf(str, symbol);
                            }
                        }
                        System.out.println(str);
                        fl_read.close();
                        System.out.println("Файл был закрыт.");
                    }
                    else if (choice == 2) {
                        String text = "Result: " + result + "\n" + number_operation_1 + symbol_operation + number_operation_2;
                        WritetoFile(text);
                    }
                    else {
                        throw new Error();
                }
                } catch (Exception e) {System.out.println(e.getMessage());}
            catch (Error e) {System.out.println("Ошибка такой опции нет");}
        }
        catch (ArithmeticException ex) {

            finally_answer = "Error! Division by Zero";
            System.out.println("Error! Division by Zero");
        }
        catch (NumberFormatException ex) {
            finally_answer = "Error! Not number";
            System.out.println("Error! Not number");
        }
        catch (Exception e){
            finally_answer = "Operation Error!";
            System.out.println("Operation Error!");
        }
        catch (Error er) {
            finally_answer = "Ошибка в выражении большое количество операций.";
            System.out.println("Ошибка в выражении большое количество операций.");
        }
        finally {
            try {
                if (finally_answer.length() > 0) {
                    WritetoFile(finally_answer);
                    System.out.println("Запись ошибки");
                }
                System.out.println("Работа программы окончена");
            }
            catch (NullPointerException e) {
                System.out.println("Ошибок нет");
            }
        }
    }

    public static void WritetoFile(String text) throws IOException {
        FileWriter fl_wr = new FileWriter("output.txt");
        fl_wr.write(text);
        fl_wr.close();
        System.out.println("Файл был закрыт");
    }
}
