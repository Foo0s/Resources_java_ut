package PZ.PZ_14.wrk_2;
class Pen extends WritingMaterials{
    static String name;
    static String color;
    int price;
    double length;
    boolean draw;

    final static String description;

    static{
        name = "Ручка";
        color = "Синяя";
        description = "Объект - ручка.";
    }

    Pen(int price, double length, boolean draw) {
        super(price, length, draw);
        setColor(color);
        setDraw(draw);
        setName(name);
        setLength(length);
        setPrice(price);
        setDescription(description);
    }

}
