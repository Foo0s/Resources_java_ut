package PZ.PZ_14.wrk_2;
class Divider extends WritingMaterials{
    static String name;
    static String color;
    int price;
    double length;
    boolean draw;

    final static String description = "Объект - циркуль.";

    static{
        name = "Циркуль";
        color = "Красный";
    }

    Divider(int price, double length, boolean draw) {
        super(price, length, draw);
        name = name; color = color; this.price = price; this.length = length; this.draw = draw;
    }

    final void drawCircle() {
        System.out.println("Циркуль нарисовал круг.");
    }
}
