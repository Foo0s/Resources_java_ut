package PZ.PZ_13;

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
