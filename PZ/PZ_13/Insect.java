package PZ.PZ_13;

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
