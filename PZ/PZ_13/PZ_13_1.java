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