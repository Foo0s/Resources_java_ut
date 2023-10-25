package PZ.PZ_16.w2;

public class Sotryd extends People{

    final int int_age_work;

    Sotryd(String name, String surname, int age, String post, int int_age_work) {
        this.name = name; this.surname = surname;
        this.age = age; this.post = post;
        this.int_age_work = int_age_work;
    }

    @Override
    void display() {
        System.out.println("Имя: " + this.name);
        System.out.println("Фамилия: " + this.surname);
        System.out.println("Лет: " + this.age);
        System.out.println("Должность: " + this.post);
        System.out.println("Сколько лет работает: " + this.int_age_work);
    }

    //Инкапсуляция//

    int getInt_age_work() {
        return this.int_age_work;
    }

    void setName(String name) {this.name = name;}
    String getName() {return this.name;}

    void setSurname(String surnaname) {this.surname = surname;}
    String getSurname() {return this.surname;}

    void setAge(int age) {this.age = age;}
    int getAge() {return this.age;}

    void setpost(String post) {this.post = post;}
    String getpost() {return this.post;}

}
