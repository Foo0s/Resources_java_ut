package PZ.PZ_13;

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
