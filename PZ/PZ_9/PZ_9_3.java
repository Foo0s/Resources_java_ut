package PZ.PZ_9;
import java.util.Scanner;
import java.util.HashSet;


//Вывести имена сотрудников какой профессии больше всего, вывести кол-воБ профессию и их имена в том же порядке в котором вводились.
public class PZ_9_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = sc.nextInt();
        HashSet<Integer> h_list = new HashSet();
        for(int j = 0; j < numb; j++){
            System.out.println("Введите число: ");
            int numb_t = sc.nextInt();
            if (h_list.contains(numb_t) == true){
                System.out.println("YES");
            }
            else System.out.println("NO"); h_list.add(numb_t);
        }
    }
}
