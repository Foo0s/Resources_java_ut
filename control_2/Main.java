package control_2;
public class Main {
    public static void main(String[] args) {
        Shop new_shop = new Shop("Берёзка", 10, "магазин", "Петропавловская 34", "Ростов-на-Дону", 50);
        new_shop.check_year_to_repair();
        new_shop.display();
        System.out.println(new_shop.getName_shop());
        new_shop.addSotryd("Павел", "Уборщик");
        new_shop.addSotryd("Андрей", "Воля");
        new_shop.display();
        new_shop.addSotryd("Владимир", "Консультант");
        new_shop.addSotryd("Дмитрий", "Консультант");
        System.out.println(new_shop.name_workers_consult());
        new_shop.addSotryd("Грегорий", "Водитель");
        System.out.println(new_shop.name_workers_voditel());
        System.out.println(new_shop.name_workers_yborshik());

        System.out.println("\n\n\n");
        Workers new_worker = new Workers("Директор", 9, "Геннадий", 45, 175, 90);
        new_worker.check_info_workers();
        new_worker.display();
        System.out.println(new_worker.getPost());
        new_worker.setAge(95);
        new_worker.setPost("Продавец");
        new_worker.check_info_workers();
        new_worker.display();

        System.out.println("\n\n\n");

        Product new_product = new Product("Еда", "Сгущёнка", "Ростов-на-Дону", "улица Ларина 23", 23099443, 2344);
        new_product.display();
        new_product.qcode();
        new_product.setDay(26);
        new_product.setDescription("Самая вкусная сгущёнка для блинов и не только!");
        new_product.setYear_g(2023);
        new_product.setMonth_g(11);
        new_product.setCount_product(30);
        System.out.println(new_product.getDescription());
        new_product.info_god_product();
        new_product.display();
        System.out.println(new_product.count_product_to_buy());
    }
}