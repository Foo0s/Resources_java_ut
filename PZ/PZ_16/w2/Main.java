package PZ.PZ_16.w2;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Создание объектов.

        ArrayList<String> lst = new ArrayList<>(Arrays.asList("Петька", "Геннадий", "Василий"));
        ArrayList<String> lst_show = new ArrayList<>(Arrays.asList("Озарные животные", "трюки на колесе", "Прыжки с батута"));

        Teatr new_teatr = new Teatr(lst, 1200, lst_show, "Театр", 1920, 4, "Петропавловская 34");
        new_teatr.count_sotryd();
        System.out.println(new_teatr.getMax_clients());
        new_teatr.setShow("Белка и стрелка");
        new_teatr.display();

        System.out.println("\n\n");
        Seans new_s = new Seans("Озарные животные", 1, "Лучшее что вы видели!", 8);
        new_s.numb_seans();
        new_s.display();
        new_s.info_artists();
        new_s.setCount_artists(10);
        new_s.display();
        System.out.println("\n\n");

        Builet new_builet = new Builet("Билет номер 1", 1290, 234);
        System.out.println(new_builet.getName_builet());
        new_builet.info_for_number_builet();
        new_builet.display();
        new_builet.info_for_price();
        new_teatr.show_info_to_builet(new_builet.info_for_number_builet());
        System.out.println("\n\n");

        Sotryd new_sotryd = new Sotryd("Кирилл", "Светлый", 26, "Униформист", 5);
        System.out.println(new_sotryd.getInt_age_work());
        new_sotryd.setAge(43);
        System.out.println(new_sotryd.getpost());
    }
}
