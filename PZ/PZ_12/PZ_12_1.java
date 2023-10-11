package PZ.PZ_12;

public class PZ_12_1 {
    public static void main(String[] args) {
        Animal tiger = new Animal("Тигр", "Артём");
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();

        //Объект №2.
        Animal cat = new Animal("кот", 4);
        cat.weight = 8;
        cat.isSwim = false;
        cat.isFly = false;
        cat.isWalk = true;
        cat.display();

        //Объект №3.
        Animal dog = new Animal("Собака", "Босс", 7, 9.1, false, true, true);
        dog.holiday(6);
        dog.rename("Мега Босс");
        dog.display();
        System.out.println(dog.isSwim());
        System.out.println(dog.isWalk());
        System.out.println(dog.isFly());
        System.out.println(dog.getAge());
        dog.setAge(6);
        System.out.println(dog.getAge());
        dog.setSwim(false);
        System.out.println(dog.isSwim());
        dog.setType("Не просто какая-то 'Собака', а Босс!");
        System.out.println(dog.getType());
    }
}


class Animal{
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    public int rename(String name) {
        this.name = name;
        return 0;
    }

    //Конструктор №1.
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    //Конструктор №2.
    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No name";
    }


    //Конструктор №3.
    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public void display() {
        System.out.println("Тип: " + this.type + ", Имя: " + this.name + ", Возраст: " + this.age + ", Вес: " + this.weight + ", Умеет летать: " + ((this.isFly == true)? "Да": "Нет") + ", Умеет ходить:" + ((this.isWalk == true)? "Да": "Нет") + ", Умеет плавать:" + ((this.isSwim == true)? "Да": "Нет"));
    }

    public void holiday(int days) {
        for (int i = 0; i < days; i++) {
            this.weight += 0.1;
        }
    }

    //Инкапсуляция, get,set//

    //Тип.
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Имя.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Возраст.
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Вес.
    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Булевы значения.

    //Умение летать.
    public boolean isFly() {
        return this.isFly;
    }

    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }

    //Умение ходить.
    public boolean isWalk() {
        return this.isWalk;
    }

    public void setWalk(boolean isWalk) {
        this.isWalk = isWalk;
    }

    //Умение плавать
    public boolean isSwim() {
        return this.isSwim;
    }

    public void setSwim(boolean isSwim) {
        this.isSwim = isSwim;
    }
}