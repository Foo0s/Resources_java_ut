package PZ.PZ_16.w2;

import PZ.PZ_16.w2.impelemnts.Seans_info;

public class Seans implements Seans_info {

    String name_seans;

    int numb_seans;

    String information;

    int count_artists;

    Seans(String name_seans, int numb_seans, String information, int count_artists) {
        this.name_seans = name_seans; this.numb_seans = numb_seans; this.information = information; this.count_artists = count_artists;
    }

    Seans() {}
    //Инкапсуляция//

    void setName_seans(String name_seans) {
        this.name_seans = name_seans;
    }

    String getName_seans() {
        return this.name_seans;
    }

    void setInformation(String information) {
        this.information = information;
    }

    String getInformation() {
        return this.information;
    }

    void setCount_artists(int count_artists) {
        this.count_artists = count_artists;
    }

    int getCount_artists() {
        return this.count_artists;
    }

    @Override
    public void display() {
        System.out.println("Название сеанса: " + this.name_seans);
        System.out.println("Информация: " + this.information);
        System.out.println("Количество артистов: " + this.count_artists);
        System.out.println("Номер сеанса " + this.numb_seans);
    }

    @Override
    public void info_artists() {
        if (this.count_artists < 4) {
            System.out.println("Небольшая группа");
        }
        else if (this.count_artists > 4) {
            System.out.println("Средняя группа");
        }
        else{
            System.out.println("Большая группа");
        }
    }

    @Override
    public void numb_seans() {
        if (this.numb_seans < 10) {
            System.out.println("Скоро начнётся новое выступление!");
        }
        else {
            System.out.println("Ещё не скоро новое выступление..");
        }
    }
}
