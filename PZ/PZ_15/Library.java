package PZ.PZ_15;
import PZ.PZ_15.interfaces.*;

public class Library extends building implements SocialHouse {
    int count_books;
    int year_repair;
    String name_city;

    Library(String name, String adress, int year_to_create, String name_arch, boolean culture_pm, int count_books, int year_repair, String name_city) {
        this.name = name; this.adress = adress; this.year_to_create = year_to_create; this.name_arch = name_arch; this.culture_pm = culture_pm;
        this.count_books = count_books;
        this.year_repair = year_repair;
        this.name_city = name_city;
    }

    void display() {
        System.out.println("Здание: Библиотека");
    }

    void showTodata() {
        System.out.println("Здание было построено в " + year_to_create);
    }

    void showtoRepair() {
        System.out.println("Ремонт в здании был проведён в " + this.year_repair);
    }

    @Override
    public String toString() {
        return this.count_books + " " + this.year_repair + " " + this.name_city;
    }

    public void information() {
        System.out.println("Это библиотека");
    }

    public void count_any() {
        System.out.println("Количество книг: " + this.count_books);
    }

    public void year_house() {
        System.out.println("Количество лет зданию: " + this.year_to_create);
    }

    //Инкапсуляция.

    int getCount_books() {
       return this.count_books;
    }

    void setCount_books(int count_books) {
        this.count_books = count_books;
    }

    int getYear_repair() {
        return this.year_repair;
    }

    void setYear_repair(int year_repair) {
        this.year_repair = year_repair;
    }

    String getName_city() {
        return this.name_city;
    }

    void setName_city(String name_city) {
        this.name_city = name_city;
    }
}
