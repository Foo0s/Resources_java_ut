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
