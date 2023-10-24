package PZ.PZ_16.w1;


import PZ.PZ_16.w1.interfaces.director;

public class Director extends People_workers implements director {

    final static int price_zp;

    static {
        price_zp = 183000;
    }

    Director(int price_zp, String surname, String name, int age, String group_h, String diagnosis, int weight, int height) {
        this.surname = surname; this.name = name; this.age = age;

        this.group_h = group_h; this.diagnosis = diagnosis; this.weight = weight; this.height = height;

        this.post = "Начальника";
    }

    //Инкапсуляция...
    String get_surname_people() {
        return this.surname;
    }

    void set_surname_people(String surname) {
        this.surname = surname;
    }

    String get_name_people() {
        return this.name;
    }

    void set_name_people(String name) {
        this.name = name;
    }

    int get_age_people() {
        return this.age;
    }

    void set_age_people(int age) {
        this.age = age;
    }

    void set_diagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    String get_diagnosis() {
        return this.diagnosis;
    }

    void set_group_h(String group_h) {
        this.group_h = group_h;
    }

    String get_group_h() {
        return this.group_h;
    }

    void set_weight(int weight) {this.weight=weight;}
    int get_weight() {return this.weight;}

    void set_height(int height) {this.height=height;}
    int get_height() {return this.height;}

    @Override
    void show_people() {
        System.out.println("Фамилия: " + this.surname + "\n" + "Имя: " + this.name + "\n" + "Годиков: " + this.age);
        System.out.println("А теперь главное....");
        System.out.println("Должность: " + this.post);
        System.out.println("Зарплата: " + price_zp);
    }

    @Override
    void show_health() {
        System.out.println("Группа здоровья: " + this.group_h + "\n" + "Диагноз: " + (this.diagnosis.isEmpty() == true? "Отсутствует": this.diagnosis) + "\n" + "Вес: " + this.weight + "\n" + "Рост: " + this.height);
    }

    @Override
    void check_result_h() {
        if (!this.diagnosis.isEmpty() && this.weight >= 100) {
            System.out.println("Всё плохо...");
        }
        else{
            System.out.println("Не так уж и плохо..");
        }
    }

    @Override
    public String show_director_name() {
        return this.name;
    }

    @Override
    public int show_director_year() {
        return this.age;
    }
}
