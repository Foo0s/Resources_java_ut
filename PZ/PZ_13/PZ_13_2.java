package PZ.PZ_13;

import java.util.Scanner;

public class PZ_13_2
{
	public static void main(String[] args) {
		WritingMaterials pen = new WritingMaterials("ручка", "оранжевый", 14, 9.2, true);
		pen.display();
		pen.priceUp(30);
		pen.priceDown(20);
		pen.draw();
		pen.display();
		WritingMaterials pen2 = new WritingMaterials("Линейка", "Синяя");
		WritingMaterials pen3 = new WritingMaterials("Транспортир", 45);
		pen2.display();
		pen3.display();
		pen3.setName("Карандаш");
		pen3.setPrice(34);
		pen3.display();
		pen.display("зелёный");
		pen.display("оранжевый", 5);
		pen.display(4);
		System.out.println("\n\n\n");
		
		//Другие предметы.
		Pen new_pen = new Pen("ручка", "синий", 15, 8.1, true, 12, true);
		new_pen.writeMyName("Борис");
		new_pen.display();
		System.out.println("\n\n\n");
		
		Rules new_rule = new Rules("Линеечка", "жёлтая", 19, 9.2, false, true);
		new_rule.measure();
		new_rule.display();
		System.out.println("\n\n\n");
		
		
		Divider new_divider = new Divider("Транспортир №1", "Голубой", 24, 12.2, true, "округлый",  true);
		new_divider.draw_circle();
		new_divider.display();
	}
}


class  WritingMaterials{
    String name;
    String color;
    int price;
    double length;
    boolean draw;
    
    void display() {
        System.out.println("Название: " + this.name + ". Цвет: " + this.color + ". Цена: " + this.price + ". Длина: " + this.length + ". Пишет: " + ((this.draw == true)? "Да": "Нет"));
    }
     
    void replace_rod(String new_color) {
        this.color = new_color;
    }
    
    void priceUp(int new_price) {
        this.price += new_price;
    }
    
    void priceDown(int new_price) {
        this.price -= new_price;
    }
    
    void draw() {
        if (this.draw == true) {
            System.out.println(this.name + " провёл линию 1. Её цвет -> " + this.color);
        }
        else {
            System.out.println(this.name + " не может ничего нарисовать.");
        }
    }
    
    //Конструкторы...
    WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    WritingMaterials(String name, int price) {
        this.name = name; this.price = price; this.color = "No Color";
    }
    
    
    WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.draw = draw;
        this.color = "No Color";
        this.name = "No Name";
    }
    
    WritingMaterials(String name, String color, int price, double length, boolean draw){
        this.name = name; this.color = color; this.price = price; this.length = length; this.draw = draw;
    }
    
    //Инкапсуляция.
    
    //Name
    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return this.name;
    }
    
    //Color.
    void setColor(String color) {
        this.color = color;
    }
    
    String getcolor() {
        return this.color;
    }
    
    //Price.
    void setPrice(int price) {
        this.price = price;
    }
    
    int getPrice() {
        return this.price;
    }
    
    //Length.
    void setLength(double length) {
        this.length = length;
    }
    
    double getLength() {
        return this.length;
    }
    
    //Draw.
    void setDraw(boolean draw) {
        this.draw = draw;
    }
    
    boolean getDraw() {
        return this.draw;
    }
    
    //Перегрузка метода.
    void display(int n) {
        if (this.draw == true) {
            System.out.println(this.name + " провёл линий: " + n + ". Их цвет: " + this.color);
        }
        else {
            System.out.println(this.name + " не может ничего нарисовать");
        }
    }
    
    
    void display(String color) {
        if (this.draw == true) {
            System.out.println(this.name + " провёл линию." + " Её цвет: " + color);
        }
        else {
            System.out.println(this.name + " не может ничего нарисовать");
        }
    }
    
    void display(String color, int n) {
        if (this.draw == true) {
            System.out.println(this.name + " провёл линии: " + n + ". " + " Её цвет: " + color);
        }
        else {
            System.out.println(this.name + " не может ничего нарисовать");
        }
    }
}


//Наследники...

class Pen extends WritingMaterials {
    
    int CountColor;
    boolean auto;
    
    public Pen(String name, String color, int price, double length, boolean draw, int CountColor, boolean auto) {
        super(name, color, price, length, draw);
        this.name = name; this.color = color; this.price = price; this.length = length; this.draw = true; this.CountColor = CountColor; this.auto = auto;
    }
    
    void writeMyName(String name) {
        System.out.println("Ваше имя: " + name);
    }

    @Override
    void display() {
        System.out.println("This is Pen");
        System.out.println("Название: " + this.name + ". Цвет: " + this.color + ". Цена: " + this.price + ". Длина: " + this.length + ". Пишет: " + ((this.draw == true)? "Да": "Нет"));
    }

}

class Rules extends WritingMaterials {
    
    double length;
    boolean wood;
    
    public Rules(String name, String color, int price, double length, boolean draw, boolean wood) {
        super(name, color, price, length, draw);
        this.name = name; this.color = color; this.price = price; this.length = length; this.draw = false; this.wood = wood;
    }
    
    void measure() {
        System.out.println("Сейчас померяем длину.");
    }
    
    @Override
    void display() {
        System.out.println("This is Rules");
        System.out.println("Название: " + this.name + ". Цвет: " + this.color + ". Цена: " + this.price + ". Длина: " + this.length + ". Пишет: " + ((this.draw == true)? "Да": "Нет"));
    }
    
}

class Divider extends WritingMaterials {
    
    String dividerType;
    boolean metal;
    
    public Divider(String name, String color, int price, double length, boolean draw, String dividerType, boolean metal) {
        super(name, color, price, length, draw);
        this.name = name; this.color = color; this.price = price; this.length = length; this.draw = true; this.dividerType = dividerType; this.metal = metal;
    }
    
    void draw_circle() {
        System.out.println("Нарисован круг.");
    }
    
    @Override
    void display() {
        System.out.println("This is Divider");
        System.out.println("Название: " + this.name + ". Цвет: " + this.color + ". Цена: " + this.price + ". Длина: " + this.length + ". Пишет: " + ((this.draw == true)? "Да": "Нет"));
    }
    
}
