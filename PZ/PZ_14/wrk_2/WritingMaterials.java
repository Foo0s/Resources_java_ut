package PZ.PZ_14.wrk_2;

class WritingMaterials {
    static String name;
    static String color;
    int price;
    double length;
    boolean draw;

    static int id;

    final private static String description = "Описание объекта.";

    static{
        name = "None";
        color = "None";
    }

    WritingMaterials(int price, double length, boolean draw) {
        this.price = price; this.length = length; this.draw = draw;
        id++;
    }

    static String showDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + " " + color + " " + price + " " + length + " " + ((draw == true)? "Да": "Нет") + ". id: " + id;
    }

    void display() {
        System.out.println("Имя: " + name + " .Цвет: " + color + " .Цена: " + this.price + " .Длина: " + this.length + " .Рисует: " + ((this.draw == true)? "Да": "Нет"));
    }
}
