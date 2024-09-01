package de.telran.lesson_2.hw_4_interface_26_08;

public class Truck extends Vehicle implements TransportationCargoes, Roll{
    public Truck(String name, int yearOfManufacture) {
        super(name, yearOfManufacture);
    }

    @Override
    public void repair() {
        System.out.println("Ремонтируется на специализированном автосервисе");
    }
}


