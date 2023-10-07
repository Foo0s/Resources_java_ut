// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Количество строк: ");
        int numb_lines = sc.nextInt(); sc.nextLine();
        ArrayList<Integer[]> n_list = new ArrayList(){};
        for(int i = 0; i < numb_lines; i++){
            System.out.println("Вводите строку чисел через пробел: ");
            String line_numb = sc.nextLine();
            String[] line = line_numb.split(" ");
            Integer[] n_lss = new Integer[line.length];
            for(int s = 0; s < line.length; s++){
                n_lss[s] = (Integer.valueOf(line[s]));
            }
            n_list.add(n_lss);
        }
        int d = 0;
        System.out.println(func_max_numb_for_line(n_list, d, n_list.size()));
    }
    
    static int func_max_numb_for_line(ArrayList<Integer[]> lst, int numb, int size_lst) {
        int numb_line = 0; int size_of_number_line = 0; int indx = 0;
        for(Integer[] massive: lst){
            int numbs = 0;
            for(int j = 0; j < massive.length; j++) {
                numbs += massive[j];
            }
            if (numbs >= size_lst && numbs % 7 == 0) {
                size_lst = numbs;
                numb = indx;
            }
            indx++;
        }
        return numb;
    }
}
