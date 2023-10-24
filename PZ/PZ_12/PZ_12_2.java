package PZ.PZ_12;

class PZ_12_2 {
    public static void main(String[] args) {

        //Объект №1.
        WritingMaterials pen1 = new WritingMaterials("ручка", "красный", 145, 15.6, true);
        pen1.display();
        pen1.draw();
        pen1.priceDown(10);
        pen1.display();
        pen1.priceUp(20);
        pen1.display();
        pen1.replace_rod("Синий");
        pen1.display();

        //Объект №2.
        WritingMaterials pen2 = new WritingMaterials("линейка", 34);
        pen2.display();
        pen2.draw();

        //Объект №3.
        WritingMaterials pen3 = new WritingMaterials("Циркуль", "Зелёный");
        pen3.isDraw = true;
        pen3.display();
        pen3.draw();
        System.out.println(pen3.getPrice());
        pen3.setPrice(90);
        System.out.println(pen3.getPrice());
        System.out.println(pen3.getName());
        pen3.setName("Карандаш");
        System.out.println(pen3.getName());
        System.out.println(pen3.getIsDraw());
        pen3.IsDraw(false);
        System.out.println(pen3.getIsDraw());
    }
}
