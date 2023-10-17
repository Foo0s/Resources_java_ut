package PZ.PZ_15;

import PZ.PZ_15.interfaces.SocialHouse;

public class HighRiseBuilding extends building implements SocialHouse {
    int count_work;
    int year_repair;
    String name_city;




    HighRiseBuilding(String name, String adress, int year_to_create, String name_arch, boolean culture_pm, int count_work, int year_repair, String name_city) {
        this.name = name; this.adress = adress; this.year_to_create = year_to_create; this.name_arch = name_arch; this.culture_pm = culture_pm;
        this.count_work = count_work;
        this.year_repair = year_repair;
        this.name_city = name_city;
    }

    @Override
    public String toString() {
        return this.count_work + " " + this.year_repair + " " + this.name_city;
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

    public void information() {
        System.out.println("Это здание на возвышенности");
    }

    public void count_any() {
        System.out.println("Количество работников: " + this.count_work);
    }

    public void year_house() {
        System.out.println("Количество лет зданию: " + this.year_to_create);
    }


    //Инкапсуляция.

    int getCount_books() {
        return this.count_work;
    }

    void setCount_books(int count_work) {
        this.count_work = count_work;
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
