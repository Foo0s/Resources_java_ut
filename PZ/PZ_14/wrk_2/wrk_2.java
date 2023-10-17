package PZ.PZ_14.wrk_2;

public class wrk_2 {
    public static void main(String[] args) {
        WritingMaterials n_wm = new WritingMaterials(38, 7, true);
        n_wm.display();
        System.out.println(n_wm.toString());
        System.out.println(n_wm.showDescription());


        Pen new_pen = new Pen(15, 12, true);
        new_pen.display();
        System.out.println(new_pen.toString());
        System.out.println(new_pen.showDescription());
    }
}
