package PZ.PZ_13;

public class PZ_13_1 {
    public static void main(String[] args) {
        Animal cat = new Animal("Кот", "Барсик", 4, 10, false, true, false);
        cat.display();
        cat.setName("Владик");
        cat.display();

        System.out.println("\n\n\n");

        Bird kesha = new Bird("Попугай", "Кеша", 2, 0.2, true, true, false);
        kesha.display();
        kesha.setArea("На югах");
        kesha.setWinterFly(false);
        kesha.display();
        kesha.chick_chirick();
        System.out.println(kesha.getArea());
        System.out.println(kesha.getIsFly());

        System.out.println("\n\n\n");

        Fish gold = new Fish("Золотая рыбка", "Рапунцель", 1, 0.07, false, false, true);
        gold.setSquama("Крупная");
        gold.display();
        gold.setUpStreamSwim(true);
        gold.setName("Алексей");
        System.out.println(gold.getSquama());
        System.out.println(gold.getIsFly());
        gold.display();
        gold.bul_bul();

        System.out.println("\n\n\n");

        Insect myr = new Insect("Жук-муравей", "Геннадий", 1, 0.0001, false, true, false);
        myr.setName("Михаил");
        myr.display();
        myr.setWingCount(3);
        myr.setLikeJesus(true);
        System.out.println(myr.getWingCount());
        System.out.println(myr.isLikeJesus());
        myr.display();
        myr.gggggg();

    }
}

class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;


    public void display() {
        System.out.println("Тип: " + this.type + ", Имя: " + this.name + ", Возраст: " + this.age + ", Вес: " + this.weight + ", Умение летать: " + ((this.isFly == true)? "Да": "Нет") + ", Умение ходить: " + ((this.isWalk == true)? "Да": "Нет") + ", Умение плавать: " + ((this.isSwim == true)? "Да": "Нет"));
    }

    public void rename(String name) {
        this.name = name;
    }

    //Перегрузка метода.
    public void holiday() {
        this.weight += 0.1;
    }

    public void holiday(double m) {
        this.weight += m;
    }

    public void holiday(int days, double m) {
        for (int i = 0; i < days; i++) {
            this.weight += m;
        }
    }


    //Конструкторы//
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No Name";
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    //Инкапсуляция//
    //Тип
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Age
    public int age() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Weight
    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //function
    public boolean getIsFly() {
        return this.isFly;
    }

    public void isFly(boolean isFly) {
        this.isFly = isFly;
    }

    public boolean getIsWalk() {
        return this.isWalk;
    }

    public void isWalk(boolean isWalk) {
        this.isWalk = isWalk;
    }

    public boolean getIsSwim() {
        return this.isSwim;
    }

    public void isSwim(boolean isSwim) {
        this.isSwim = isSwim;
    }
}


//Классы наследники.
class Bird extends Animal{

    String area;
    boolean winterFly;

    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = true;
    }

    @Override
    public void display() {
        System.out.println("I am a Bird");
        System.out.println("Описание класca:\n1. Area - среда обитания.\n2. WinterFly - Летает зимой");
        System.out.println("Тип: " + this.type + ", Имя: " + this.name + ", Возраст: " + this.age + ", Вес: " + this.weight + ", Умение летать: " + ((this.isFly == true)? "Да": "Нет") + ", Умение ходить: " + ((this.isWalk == true)? "Да": "Нет") + ", Умение плавать: " + ((this.isSwim == true)? "Да": "Нет"));
    }

    public void chick_chirick() {
        System.out.println("Chick-chirick");
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return this.winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }
}

class Fish extends Animal {

    String squama;
    boolean upStreamSwim;

    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = true;
    }

    @Override
    public void display() {
        System.out.println("I am a Fish");
        System.out.println("Описание класca:\n1. squama - тип чешуи.\n2. upStreamSwim - плывёт против течения");
        System.out.println("Тип: " + this.type + ", Имя: " + this.name + ", Возраст: " + this.age + ", Вес: " + this.weight + ", Умение летать: " + ((this.isFly == true)? "Да": "Нет") + ", Умение ходить: " + ((this.isWalk == true)? "Да": "Нет") + ", Умение плавать: " + ((this.isSwim == true)? "Да": "Нет"));
    }
    public void bul_bul() {
        System.out.println("Bul-bul");
    }

    public String getSquama() {
        return this.squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return this.upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }
}


class Insect extends Animal{

        int wingCount;
        boolean likeJesus;

    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = true;
        this.isSwim = isSwim;
    }

    @Override
    public void display() {
        System.out.println("I am a Insect");
        System.out.println("Описание класca:\n1. wingCount - количество крыльев.\n2. likeJesus - умение ходить по воде");
        System.out.println("Тип: " + this.type + ", Имя: " + this.name + ", Возраст: " + this.age + ", Вес: " + this.weight + ", Умение летать: " + ((this.isFly == true)? "Да": "Нет") + ", Умение ходить: " + ((this.isWalk == true)? "Да": "Нет") + ", Умение плавать: " + ((this.isSwim == true)? "Да": "Нет"));
    }

    public void gggggg() {
        System.out.println("Gggggg");
    }

    public int getWingCount() {
        return this.wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return this.likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }
}
