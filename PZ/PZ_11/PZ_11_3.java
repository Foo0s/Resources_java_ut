import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int count_i = 0;
    static int line = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество строк: ");
        int number_line = sc.nextInt(); sc.nextLine();
        ArrayList<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < number_line; i++) {
            String line = sc.nextLine();
            String[] m_l = line.split(" ");
            Integer[] res = new Integer[m_l.length];
            for (int j = 0; j < m_l.length; j++) {
                res[j] = Integer.parseInt(m_l[j]);
            }
            list.add(res);
        }
        System.out.println(find_line7(list));
    }

    static int find_line7(ArrayList<Integer[]> lst) {
        int result = 0; int cc = 0;
        for(Integer[] s: lst){
            count_line(s);
            if (count_i >= result & count_i % 7 == 0) {result = count_i; line = cc;}
            cc++;
            count_i = 0;
        }
        return line;
    }

    static int count_line(Integer[] line) {
        for (int i = 0; i < line.length; i++) {
            count_i += line[i];
        }
        return count_i;
    }
}
