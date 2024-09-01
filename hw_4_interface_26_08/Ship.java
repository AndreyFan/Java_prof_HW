package de.telran.lesson_2.hw_4_interface_26_08;

public class Ship extends Vehicle implements Swim, TransportationCargoes {
    public Ship(String name, int yearOfManufacture) {
        super(name, yearOfManufacture);
    }

    @Override
    public void TransportCargoes() {
        System.out.println(name+ "  перевозит грузы по морям и океанам");
    }

    @Override
    public void repair() {
        System.out.println(name+ "  ремонтируют на судоремонтных заводах");
    }
}
