package PZ.PZ_16.w2;

import PZ.PZ_16.w2.impelemnts.Builet_info;

public class Builet extends Seans implements Builet_info {

    String name_builet;
    int price;
    int number_builet;

    Builet(String name_builet, int price, int number_builet) {
        this.name_builet = name_builet; this.price = price; this.number_builet = number_builet;
    }

    Builet() {}

    //Инкапсуляция//

    void setName_builet(String name_builet) {
        this.name_builet = name_builet;
    }

    String getName_builet() {
        return this.name_builet;
    }

    void setPrice(int price) {
        this.price = price;
    }

    int getPrice() {
        return this.price;
    }

    void setNumber_builet(int numberBuilet) {
        this.number_builet = numberBuilet;
    }

    int getNumber_builet() {
        return this.number_builet;
    }

    @Override
    public String info_for_price() {
        if (this.price <= 1000) {
            return "малый";
        }
        else if (this.price >= 2500) {
            return "средний";
        }
        else {
            return "премиум";
        }
    }

    @Override
    public Boolean info_for_number_builet() {
        if (this.number_builet <= 100) {
            return true;
        }
        else {
            return false;
        }
    }
}
