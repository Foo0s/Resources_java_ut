package PZ.PZ_15;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Районная библиотека №1", "ул. Шолохова 34", 1960, "Даниил", true, 2300, 2015, "Rostov-on-Don");
        library.count_any();
        library.display();
        System.out.println(library.getCount_books());
        library.information();
        System.out.println(library.toString());
        library.year_house();

        System.out.println("\n\n\n");

        University university = new University("ДГТУ", "ул. Тургенева 10/6", 1921, "Каламбет", false, 4100, 1990, "Rostov-on-Don");
        university.count_any();
        university.display();
        System.out.println(university.getCount_books());
        university.information();
        System.out.println(university.toString());
        university.year_house();

        System.out.println("\n\n\n");

        ShoppingCenter shoppingCenter = new ShoppingCenter("Горизонт", "ул. Герасименко 101", 1912, "Горбун", false, 120, 2010, "Voronesh");
        shoppingCenter.count_any();
        shoppingCenter.display();
        System.out.println(shoppingCenter.getCount_books());
        System.out.println(shoppingCenter.getName_city());
        shoppingCenter.information();
        shoppingCenter.year_house();

        System.out.println("\n\n\n");

        House house = new House("Усадьба", "ул. Труженника 23", 1945, "Павел", false, 5, 2001, "Voronesh");
        house.count_any();
        house.display();
        System.out.println(house.getYear_repair());
        house.information();
        System.out.println(house.getName_city());
        System.out.println(house.toString());

        System.out.println("\n\n\n");

        PoliceDepartament policedep = new PoliceDepartament("Полицейский участок №1", "ул. Федота 2", 1956, "Юрий", true, 70, 2010, "Rostov-on-Don");
        policedep.count_any();
        policedep.display();
        System.out.println(policedep.getCount_books());
        System.out.println(policedep.getYear_repair());
        policedep.information();

        System.out.println("\n\n\n");

        HighRiseBuilding hrb = new HighRiseBuilding("Здание №1 на горе Даниил", "ул. Горная 1", 2020, "Даниил", false, 20, 0, "Vladivostok");
        hrb.information();
        hrb.count_any();
        hrb.display();
        System.out.println(hrb.getName_city());
        System.out.println(hrb.toString());
    }
}
