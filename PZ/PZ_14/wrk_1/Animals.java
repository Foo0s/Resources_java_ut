package PZ.PZ_14.wrk_1;


class Animals {

    //Инициализаторы...
    String name = "None";
    String type = "None";
    private final static String description = "Описание животного.";
    static int id;

    Animals(String name, String type){
        this.name = name;
        this.type = type;
        id++;
    }

    static void showDescription() {
        System.out.println(description);
    }


    @Override
    public String toString() {
        return this.name + " " + this.type + " id: " + id;
    }

    public void display() {
        System.out.println("Имя: " + this.name + " Тип: " + this.type);
    }

    final void rename(String name) {
        this.name = name;
    }
}

