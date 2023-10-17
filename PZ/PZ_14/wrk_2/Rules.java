package PZ.PZ_14.wrk_2;
final class Rules extends WritingMaterials{
    static String name;
    static String color;
    int price;
    double length;
    boolean draw;
    final static String description = "Объект - Линейка.";


    static{
        name = "Линейка";
        color = "Зелёная";
    }

    Rules(int price, double length, boolean draw) {
        super(price, length, draw);
        name = name; color = color; this.price = price; this.length = length; this.draw = draw;
    }

}
