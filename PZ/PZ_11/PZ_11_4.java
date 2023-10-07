import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты короля: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt(); sc.nextLine();
        System.out.println("Введите координаты другой фигуры: ");
        int x2 = sc.nextInt(); int y2 = sc.nextInt();
        System.out.println("Работа функции: ");
        System.out.println(king_step(x1, y1, x2, y2));
    }
    
    static String king_step(int x1, int y1, int x2, int y2) {
        if ((x1 <= 8 && y1 <= 8) && (x2 <= 8 && y2 <= 8)) {
            if (x1 == 0 || y1 == 0 || x2 == 0 || y2 == 0) {
                if ((x1==x2 || x1==x2-1) && (y1==y2 || y1==y2-1)) return "YES";
                else return "NO";
            }
            return king_step(x1-1, y1-1, x2-1, y2-1);
        }
        if (x1 > 8 || y1 > 8) return "1";
        if (x2 > 8 || y2 > 8) return "2";
        return "Complited";
    }
}
