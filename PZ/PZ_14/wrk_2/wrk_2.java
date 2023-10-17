package PZ.PZ_14.wrk_2;

public class wrk_2 {
    public static void main(String[] args) {
        WritingMaterials n_wm = new WritingMaterials(38, 7, true);
        n_wm.display();
        System.out.println(n_wm.toString());
        System.out.println(n_wm.showDescription());

        System.out.println("\n\n");

        Pen new_pen = new Pen(15, 12, true);
        new_pen.display();
        System.out.println(new_pen.toString());
        System.out.println(new_pen.name);
        System.out.println(new_pen.getName());
        System.out.println(new_pen.showDescription());


        System.out.println("\n\n");

        Rules n_rules = new Rules(20, 3, true);
        n_rules.display();
        System.out.println(n_rules.toString());
        System.out.println(n_rules.showDescription());

        System.out.println("\n\n");

        Divider n_div = new Divider(25, 4, true);
        n_div.display();
        System.out.println(n_div.toString());
        System.out.println(n_div.showDescription());
        n_div.drawCircle();
    }
}
