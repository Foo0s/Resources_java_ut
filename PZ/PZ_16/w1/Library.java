package PZ.PZ_16.w1;

import java.util.Scanner;
import java.util.ArrayList;
import PZ.PZ_16.w1.interfaces.Repair_str;
import PZ.PZ_16.w1.interfaces.books_find;

public class Library extends building implements Repair_str, books_find{
    //Scanner Obj//
    Scanner sc = new Scanner(System.in);


    //Данные, атрибуты, поля.
    ArrayList<String> books;
    ArrayList<String> workers;
    ArrayList<String> clients;

    //Конструктор.
    Library(int year_to_create, int floor, String street, ArrayList<String> books, ArrayList<String> workers, ArrayList<String> clients) {
        this.name_build = "Библиотека"; this.floor = floor; this.street = street;

        this.books = books;
        this.workers = workers;
        this.clients = clients;
    }


    void display() {
        System.out.println("Библиотека.");
        System.out.println("Улица: " + this.street);
        System.out.println("Количество книг: " + this.books.size());
        System.out.println("Количество работников: " + this.workers.size());
        System.out.println("Количество клиентов: " + this.clients.size());
    }

    //Инкапсуляция.
    void setBooks(String book) {
        this.books.add(book);
        System.out.println("Great!");
    }

    void getBook(String book) {
        if (this.books.contains(book)) {
            System.out.println("Ваша книга: " + this.books.get(this.books.indexOf(book)));
        }
        else {
            System.out.println("Книга отсутствует, хотите её добавить? (Y-1: N-2)");
            String choice_user_answer = sc.nextLine();
            if (choice_user_answer.equals("y")) {
                setBooks(book);
            }
            else {
                System.out.println("Предложение отклонено");
            }
        }
    }

    void setWorkers(String workers) {
        System.out.println("Добавление работника: ");
        this.workers.add(workers);
    }

    void getWorkers(String workers) {
        if (this.workers.contains(workers)) {
            System.out.println("Работник: " + this.workers.get(this.workers.indexOf(workers)));
        }
        else {
            System.out.println("Работник отсутствует, хотите его добавить? (Y-1: N-2)");
            String choice_user_answer = sc.nextLine();
            if (choice_user_answer.equals("y")) {
                setWorkers(workers);
            }
            else {
                System.out.println("Предложение отклонено");
            }
        }
    }

    void setClients(String clients) {
        System.out.println("Добавление клиента");
        this.clients.add(clients);
    }

    void getClients(String clients) {
        if (this.clients.contains(clients)) {
            System.out.println("Работник: " + this.clients.get(this.clients.indexOf(clients)));
        }
        else {
            System.out.println("Работник отсутствует, хотите его добавить? (Y-1: N-2)");
            String choice_user_answer = sc.nextLine();
            if (choice_user_answer.equals("y")) {
                setWorkers(clients);
            }
            else {
                System.out.println("Предложение отклонено");
            }
        }
    }

    void del_workers(String name) {
        int id = this.workers.indexOf(name);
        this.workers.remove(id);
        System.out.println("Работник был удалён!");
    }

    void del_workers() {
        this.workers.clear();
        System.out.println("Все работники были уволены");
    }

    //Перегрузка методов//

    int getBooks() {
        return this.books.size();
    }

    int getWorkers() {
        return this.workers.size();
    }

    int getClients() {
        return this.clients.size();
    }

    //Implements..
    public void wasRepair(int year) {
        System.out.println("Ремонт был");
    }

    public void wasRepair() {
        System.out.println("Ремонта не было");
    }

    public void year_to_Repair(int year) {
        System.out.println("Год ремонта: " + year);
    }

    public void year_to_Repair() {
        System.out.println("Отсутствует дата");
    }

    public void show_to_director(String name_director) {
        System.out.println("Директор: " + name_director);
    }

    public void show_to_director() {
        System.out.println("Директор в отставке...");
    }

    @Override
    public void books_find() {
        System.out.println("Все книги: ");
        System.out.println(this.books.toString());
    }

    @Override
    public void del_books() {
        this.books.clear();
        System.out.println("Список книг был успешно очищен.");
    }
}
