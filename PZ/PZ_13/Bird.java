package PZ.PZ_13;

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