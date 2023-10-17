package PZ.PZ_14.wrk_2;
class Divider extends WritingMaterials{
    static String name;
    static String color;
    int price;
    double length;
    boolean draw = true;

    final static String description = "Объект - циркуль.";

    static{
        name = "Циркуль";
        color = "Красный";
    }

    Divider(int price, double length, boolean draw) {
        super(price, length, draw);
        setColor(color);
        setDraw(draw);
        setName(name);
        setLength(length);
        setPrice(price);
        setDescription(description);
    }

    final void drawCircle() {
        System.out.println("Циркуль нарисовал круг.");
    }
}
