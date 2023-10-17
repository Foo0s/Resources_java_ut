package PZ.PZ_14.wrk_1;

public class wrk_1 {
    public static void main(String[] args) {
        Animals cat = new Animals ("Барсик", "Кот");
        cat.display();
        cat.showDescription();
        System.out.println(cat.toString());
        cat.rename("Рыжик");
        cat.display();

        System.out.println("\n\n");

        Animals cat2 = new Animals("Мурзик", "Кот");
        cat2.display();
        cat2.showDescription();
        System.out.println(cat2.toString());

        System.out.println("\n\n");

        Fish gold_fish = new Fish("Рапунцель", "Рыбка");
        gold_fish.display();
        System.out.println(gold_fish.toString());
        gold_fish.showDescription();
        gold_fish.rename("Краб");
        gold_fish.display();

        System.out.println("\n\n");

        Insect new_inscet = new Insect("Борис", "Муравей");
        new_inscet.display();
        System.out.println(new_inscet.toString());
        new_inscet.showDescription();
    }
}
