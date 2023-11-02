import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

class Main{
    public static void main(String[] argc) {
        /*
            Практическая работа №18.
            Чтение и запись данных в файл.
        */
        System.out.println("Введите арифмитическое выражение: ");
        Scanner sc = new Scanner(System.in);
        String[] string_arg = sc.nextLine().split(" ");
        ArrayList<String> symbol_to_operations = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
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
                        FileReader fl_read = new FileReader("info.txt");
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
                        FileWriter fl_write = new FileWriter("output.txt");
                        fl_write.write("Result: " + result);
                        fl_write.write("\n");
                        fl_write.write(String.join(" ", string_arg));
                        fl_write.close();
                        System.out.println("Файл был закрыт");
                    }
                    else {
                        throw new Error();
                }
                } catch (Exception e) {System.out.println(e.getMessage());}
            catch (Error e) {System.out.println("Ошибка такой опции нет");}
        }
        catch (ArithmeticException ex) {
            System.out.println("Error! Division by Zero");
        }
        catch (NumberFormatException ex) {
            System.out.println("Error! Not number");
        }
        catch (Exception e){
            System.out.println("Operation Error!");
        }
        catch (Error er) {
            System.out.println("Ошибка в выражении больше операций.");
        }

    }
}
