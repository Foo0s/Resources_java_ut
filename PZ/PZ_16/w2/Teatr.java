package PZ.PZ_16.w2;

import PZ.PZ_16.w2.impelemnts.Show_data_sotryd;

import java.util.ArrayList;

public class Teatr extends building implements Show_data_sotryd {

    ArrayList<String> sotryd = new ArrayList<>();
    int max_clients;
    ArrayList<String> show = new ArrayList<>();

    Teatr(ArrayList<String> sotryd, int max_clients, ArrayList<String> show, String name, int year_to_create, int floor, String street) {
        super(name, year_to_create, floor, street);
        this.name = name; this.year_to_create = year_to_create; this.floor = floor; this.street = street;
        this.sotryd = sotryd; this.max_clients = max_clients; this.show = show;
    }

    final void display() {
        System.out.println("Количество сотрудников: " + this.sotryd.size());
        System.out.println("Максимальное количество клиентов: " + this.max_clients);
        System.out.println("Количество представлений, спектаклей: " + this.show.size());
    }

    void show_info_to_builet(boolean builet) {
        if (builet) {
            System.out.println("Вы первой в очереди.");
        }
        else {
            System.out.println("Ваша очередь ещё не скоро..");
        }
    }

    void price_builet(String builet) {
        if (builet.equals("малый")) {
            System.out.println("Ваш ряд в самом конце...");
        }
        else if (builet.equals("средний")) {
            System.out.println("Вы где-то посередине..");
        }
        else {
            System.out.println("Да вы богатый! Дай те деняг..");
        }
    }

    //Инкапсуляция//

    void setMax_clients(int max_clients) {
        this.max_clients = max_clients;
    }

    int getMax_clients() {
        return this.max_clients;
    }

    void setSotryd(String sotryd) {
        this.sotryd.add(sotryd);
    }

    String getSotryd(String sotryd) {
        return this.sotryd.get(this.sotryd.indexOf(sotryd));
    }

    void setShow(String show) {
        this.sotryd.add(show);
    }

    String getShow(String show) {
        return this.sotryd.get(this.sotryd.indexOf(show));
    }

    @Override
    public void show_all_sotryd() {
        System.out.println("Все сотрудники: ");
        System.out.println(this.sotryd.toString());
    }

    @Override
    public void count_sotryd() {
        System.out.println("Количество всех сотрудников: " + this.sotryd.size());
    }

    void delshow() {
        this.show.clear();
    }

    void delshow(String name) {
        this.show.remove(this.show.indexOf(name));
    }

    void delsotryd() {
        this.sotryd.clear();
    }

    void delsotryd(String sotryd) {
        this.sotryd.remove(this.sotryd.indexOf(sotryd));
    }
}
