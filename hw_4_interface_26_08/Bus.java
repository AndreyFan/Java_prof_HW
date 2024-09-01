package de.telran.lesson_2.hw_4_interface_26_08;

public class Bus extends Vehicle implements TransportationPassengers, Roll{

    public Bus(String name, int yearOfManufacture) {
        super(name, yearOfManufacture);
    }

    @Override
    public void repair() {
        System.out.println("Ремонтируется на СТО того АТП в котором эксплуатируется");
    }

    @Override
    public void transportPassenger() {
        System.out.println(name+ "  перевозит пассажиров как все автобусы");
    }
}
