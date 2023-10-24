package PZ.PZ_16.w1;

import java.util.ArrayList;

public class Repair{

    int year_to_repair;

    int time_to_repair_year;

    Repair(int year_to_repair, int time_to_repair_year) {
        this.year_to_repair = year_to_repair;
        this.time_to_repair_year = time_to_repair_year;
    }

    void setYear_to_repair(int year_to_repair) {
        this.year_to_repair = year_to_repair;
    }

    int getYear_to_repair() {
        return this.year_to_repair;
    }

    void setTime_to_repair_year(int time_to_repair_year) {
        this.time_to_repair_year = time_to_repair_year;
    }

    int getTime_to_repair_year() {
        return this.time_to_repair_year;
    }
}
