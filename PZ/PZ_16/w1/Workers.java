package PZ.PZ_16.w1;
import PZ.PZ_16.w1.interfaces.Workers_stats;

import java.util.Scanner;

public class Workers extends People_workers implements Workers_stats{

    //Obj Scanner;
    Scanner sc = new Scanner(System.in);

    int year_to_work;

    Workers(String surname, String name, int age, String post, int year_to_work, String group_h, String diagnosis, int weight, int height) {
        this.surname = surname; this.name = name; this.age = age;
        this.post = post;
        this.year_to_work = year_to_work;

        this.group_h = group_h;
        this.diagnosis = diagnosis;
        this.weight = weight;
        this.height = height;
    }

    @Override
    void show_people() {
        System.out.println("Фамилия: " + this.surname + "\n" + "Имя: " + this.name + "\n" + "Годиков: " + this.age);
        System.out.println("А теперь главное....");
        System.out.println("Должность: " + this.post);
        System.out.println("Количество отработанных лет: " + this.year_to_work);
    }


    //Инкапсуляция//

    int get_year_to_work() {
        return this.year_to_work;
    }

    void setYear_to_work(int year_to_work) {
        this.year_to_work = year_to_work;
    }

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

    String set_post_people(String post) {
        if (this.post.equals("Начальник") || this.post.equals("Директор")) {
            System.out.println("Начальника нельзя увольнять, зарплата не быть...\nВы уверены? (Y~N)");
            String choice = sc.nextLine();
            if (choice.equals("Y")) {
                this.post = post;
                return this.post;
            }
            else {
                System.out.println("То-то же не нужно начальника увольнять!");
            }
        }
        return this.post;
    }

    String get_post_people() {
        return this.post;
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
    public double index_mh() {
        double h = (double) this.height / 100;
        return (double) (this.weight / (h*h));
    }

    @Override
    public void analytics_work() {
        if (this.year_to_work >= 2) {
            System.out.println("Junior");
        }
        else if (this.year_to_work > 4 && this.year_to_work < 9) {
            System.out.println("Middle");
        }
        else if (this.year_to_work >= 10) {
            System.out.println("Krutoi chel");
        }
    }
}
