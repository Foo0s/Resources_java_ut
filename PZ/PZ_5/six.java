package PZ.PZ_5;
import java.util.Scanner;

public class six {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int numb = ss.nextInt();
        int[] n_massive = new int[numb];
        for (int i = 0; i < numb; i++){
            System.out.println("Число: ");
            n_massive[i] = ss.nextInt();
        }
        if (numb % 2 == 0){
            for (int k = 0; k < numb; k+= 2){
                if (k < numb){
                    int replace_number = n_massive[k];
                    n_massive[k] = n_massive[k+1];
                    n_massive[k+1] = replace_number;
                }
            }
        }
        else{
            for (int k = 0; k < numb-1; k += 2){
                if (k < numb-1){
                    int replace_number = n_massive[k];
                    n_massive[k] = n_massive[k+1];
                    n_massive[k+1] = replace_number;
                }
            }
        }
        System.out.println("Значения массива: ");
        for (int x = 0; x<n_massive.length; x++){
            System.out.println(n_massive[x]);
        }
    }
}
