package PZ.PZ_12;

class PZ_12_2 {
    public static void main(String[] args) {

        //Объект №1.
        WritingMaterials pen1 = new WritingMaterials("ручка", "красный", 145, 15.6, true);
        pen1.display();
        pen1.draw();
        pen1.priceDown(10);
        pen1.display();
        pen1.priceUp(20);
        pen1.display();
        pen1.replace_rod("Синий");
        pen1.display();

        //Объект №2.
        WritingMaterials pen2 = new WritingMaterials("линейка", 34);
        pen2.display();
        pen2.draw();

        //Объект №3.
        WritingMaterials pen3 = new WritingMaterials("Циркуль", "Зелёный");
        pen3.isDraw = true;
        pen3.display();
        pen3.draw();
        System.out.println(pen3.getPrice());
        pen3.setPrice(90);
        System.out.println(pen3.getPrice());
        System.out.println(pen3.getName());
        pen3.setName("Карандаш");
        System.out.println(pen3.getName());
        System.out.println(pen3.getIsDraw());
        pen3.IsDraw(false);
        System.out.println(pen3.getIsDraw());
    }
}

class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean isDraw;


    //Конструктор №1.
    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //Конструктор №2.
    public WritingMaterials(String name, int price) {
        this.name = name;
        this.price = price;
        this.color = "No Color";
    }

    //Конструктор №3.
    public WritingMaterials(int price, double length, boolean isDraw) {
        this.price = price;
        this.length = length;
        this.isDraw = isDraw;
        this.name = "No Name";
        this.color = "No Color";
    }

    //Конструктор №4.
    public WritingMaterials(String name, String color, int price, double length, boolean isDraw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.isDraw = isDraw;
    }

    public void display() {
        System.out.println("Название: " + this.name + " Цвет: " + this.color + " Цена: " + this.price + " Длина: " + this.length + " Пишет: " + ((isDraw == true)? "Да": "Нет"));
    }

    public void replace_rod(String color) {
        this.color = color;
    }

    public void priceUp(int price) {
        this.price += price;
    }

    public void priceDown(int price) {
        this.price -= price;
    }

    public void draw() {
        if (this.isDraw == true) {
            System.out.println(this.name + " провёл линию. " + "Её цвет - " + this.color);
        }
        else {
            System.out.println(this.name + " не может ничего нарисовать");
        }
    }

    //Инкапсуляция.

    //Предмет.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Цвет.
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Цена.
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Длина
    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Функция - рисовать.
    public boolean getIsDraw() {
        return this.isDraw;
    }

    public void IsDraw(boolean isDraw) {
        this.isDraw = isDraw;
    }
}
