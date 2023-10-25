package PZ.PZ_16.w2;

public abstract class building {

    String name;

    int year_to_create;

    int floor;

    String street;

    public building(String name, int yearToCreate, int floor, String street) {
        this.name = name; this.year_to_create = yearToCreate; this.floor = floor; this.street = street;
    }

    abstract void display();
}
