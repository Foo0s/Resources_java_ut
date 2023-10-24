package PZ.PZ_16.w1;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Создание объектов.
        ArrayList<String> books = new ArrayList<>(Arrays.asList("Мастер и Маргарита", "Кукушка", "Домик на окрайне реки"));
        ArrayList<String> workers = new ArrayList<>(Arrays.asList("Андрей Сулок", "Екатерина Ромашко", "Павел Дуров"));
        ArrayList<String> clients = new ArrayList<>(Arrays.asList("Путин", "Лукашенко", "Макрон"));
        Library Rostov_Library = new Library(2010, 4, "Ларина 21/1", books, workers, clients);
        Rostov_Library.display();
        System.out.println("\n\n");
        Rostov_Library.getBook("Кукушка");
        Rostov_Library.getBook("Пермь 2020");
        Rostov_Library.setBooks("Ростов История нашей Родины");
        Rostov_Library.getWorkers("Анастасия");
        System.out.println(Rostov_Library.getWorkers());
        System.out.println("\n\n");
        Rostov_Library.del_workers("Андрей Сулок");
        Rostov_Library.display();
        System.out.println("\n\n");
        Rostov_Library.del_workers();
        Rostov_Library.display();
        System.out.println("\n\n");


        Repair rep_rostov_library = new Repair(2015, 4);
        Rostov_Library.wasRepair(rep_rostov_library.getYear_to_repair());
        Rostov_Library.year_to_Repair(rep_rostov_library.year_to_repair);
        Rostov_Library.wasRepair();
        rep_rostov_library.setTime_to_repair_year(8);
        System.out.println(rep_rostov_library.getTime_to_repair_year());
        System.out.println("\n\n");


        Workers new_workers = new Workers("Дуров", "Павел", 32, "Программист", 15, "3", "", 85, 175);
        new_workers.check_result_h();
        System.out.println(new_workers.get_post_people());
        System.out.println(new_workers.get_surname_people());
        System.out.println(new_workers.get_surname_people());
        System.out.println("\n\n");


        Director Boss = new Director(234000, "Богатько", "Кирилл", 45, "2", "Плоскостопие", 90, 178);
        System.out.println(Boss.get_group_h());
        System.out.println(Boss.get_diagnosis());
        System.out.println(Boss.get_surname_people());
        System.out.println(Boss.get_height());

        Rostov_Library.show_to_director(Boss.get_name_people());
        Rostov_Library.show_to_director();

        System.out.println("\n\n");
        Clients new_client = new Clients("Васильев", "Александр", 32, "Дворник", "4","Сахарный диабет", 105, 165);
        System.out.println(new_client.height());
        new_client.check_result_h();
        System.out.println(new_client.index_mh());
    }
}
