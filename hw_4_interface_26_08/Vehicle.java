package de.telran.lesson_2.hw_4_interface_26_08;

public abstract class Vehicle {
    String name;
    int yearOfManufacture;

    public Vehicle(String name, int yearOfManufacture) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
    }

    public final void service() {
        System.out.println(name + "  проходит регулярно сервисное обслуживание в сертифицированном центре");
    }

    public abstract void repair();


}
