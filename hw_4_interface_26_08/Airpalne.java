package de.telran.lesson_2.hw_4_interface_26_08;

public class Airpalne extends Vehicle implements Fly, TransportationCargoes{

    public Airpalne(String name, int yearOfManufacture) {
        super(name, yearOfManufacture);
    }

    @Override
    public void TransportCargoes() {
        System.out.println(name+ " перевозит грузы по воздуху");
    }

    @Override
    public void repair() {
        System.out.println(name+ " ремонтируется авиатехниками в ангаре");
    }
}
