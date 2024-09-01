package de.telran.lesson_2.hw_4_interface_26_08;

public class Car extends Vehicle implements Roll, TransportationPassengers, TransportationCargoes {


    public Car(String name, int yearOfManufacture) {
        super(name, yearOfManufacture);
    }

    @Override
    public void transportPassenger() {
        System.out.println(name+ " перевозит не более 4-х пассажиров ");
    }

    @Override
    public void repair() {
        System.out.println(name+ "  может ремонтировать хозяин или СТО ");
    }


    @Override
    public void TransportCargoes() {
        System.out.println(name+ "  перевозит не более 50 кг груза в багажнике");
    }
}
